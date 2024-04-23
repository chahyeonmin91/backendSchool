package study.babyLion.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOExam03 {
    //파일에서부터 한줄씩 읽어서 콘솔에 출력하는 코드 = Buffered
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("ioexam.txt"));
            PrintWriter pw = new PrintWriter("pwOutput.txt");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("line = " + line);
            }





        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
