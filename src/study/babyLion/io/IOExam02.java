package study.babyLion.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IOExam02 {
    public static void main(String[] args) {
        //파일에다가 출력
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            String output = "Hi there!";
            fos.write(output.getBytes());
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
