package study.day12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStreamExam  {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("a.txt")) {
            FileWriter writer = new FileWriter("c.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
