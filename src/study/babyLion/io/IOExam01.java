package study.babyLion.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOExam01 {
    public static void main(String[] args) {
        //파일로부터 읽어와서 콘솔에 출력하는 코드를 작성해보자
        //FileInputStream fis = new FileInputStream("ioexam.txt");
        //얘만하면 안돼서예외처리를 해야함
        try{
            FileInputStream fis = new FileInputStream("ioexam.txt");
            int i =0;
            int count =0;
            while((i=fis.read())!=-1){
                count++;
                System.out.print((char)i);
            }
            System.out.println("총"+count);
        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.out.println("파일이 존재하지 않아요");
        }catch(IOException e){
            System.out.println(e);
            System.out.println("파일로부터 입력받는 중에 예외가 발생해썽요");
        }

    }
}
