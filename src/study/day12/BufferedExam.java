package study.day12;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedExam {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw = new FileWriter("bufferedExam.txt");) {

            for (int i = 0; i < 5; i++) {
                System.out.print("무엇이든 입력하세요 : ");
                fw.write(br.readLine() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
