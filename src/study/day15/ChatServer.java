package study.day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class ChatServer {
    public static void main(String[] args) {
        //1.서버소켓을 생성
        try(ServerSocket serverSocket = new ServerSocket(9999);){
            System.out.println("서버가 준비되었습니다");
            //여러명의 클라이언트의 정보를 기억할 공간
            Map<String, PrintWriter> chatClients = new HashMap<>();
            while (true) {
                //2.accept()를 통해서 소켓을 얻어옴(여러명의 클라이언트와 접속할 수 있도록 구현)
                Socket socket = serverSocket.accept();
                //Thread 이용
                //여러명의 클라이언트의 정보를 기억할 공간
                new ChatThread(socket, chatClients).start();
            }


        }catch (Exception e){
            System.out.println(e);
        }

    }
}
class ChatThread extends Thread {
    //생성자를 통해서 클라이언트 소켓을 얻어옴
    private Socket socket;
    private String id;
    private Map<String, PrintWriter> chatClients;
    BufferedReader in =null;


    public ChatThread(Socket socket, Map<String, PrintWriter> chatClients) {
        this.socket = socket;
        this.chatClients = chatClients;

        //클라이언트가 생성될 때 클라이언트로부터 아이디를 얻어오게 하고 싶어요
        //각각 클라이언트와 통신할 수 있는 통로 얻어옴
        try (PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        ){
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //Client가 접속하자마자 id를 보낸다는 약속
            id = in.readLine();
            //이때.. 모든 사용자에게 id님이 입장했다는 정보를 알려줌
            broadcast(id +"님이 입장하셨습니다.");
            System.out.println("새로운 가용자의 아이디는 " + id + "입니다");

            //동시에 일어날 수도..
            synchronized (chatClients) {
                chatClients.put(this.id, out);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }


    @Override
    public void run() {
        //run
        //연결된 클라이언트가 메세지를 전송하면, 그 메세지를 받아서 다른 사용자에게 보내줌..
        String msg = null;
        try {
            while ((msg = in.readLine()) != null) {
                if ("/quit".equalsIgnoreCase(msg)) {
                    break;
                }
                broadcast(id + ":" + msg);
            }
        } catch (IOException e) {
            System.out.println(e);
        }finally{
            synchronized (chatClients) {
                chatClients.remove(this.id);
            }
            broadcast(id+ "님이 채팅에서 나갔습니다");
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    //전체 사용자에게 알려주는 메소드
    public void broadcast(String msg) {
        for(PrintWriter out : chatClients.values()) {
            out.println(msg);
        }

    }


}
