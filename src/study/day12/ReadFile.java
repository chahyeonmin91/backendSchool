package study.day12;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");
        int n;
        byte[] bytes = new byte[1024];
        while ((n = fis.read(bytes)) != -1) {
            String str = new String(bytes);
            fos.write(bytes);

        }
        fos.close();
        fis.close();

    }
}

