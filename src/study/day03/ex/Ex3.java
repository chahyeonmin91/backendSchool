package study.day03.ex;

public class Ex3 {
    public static void main(String[] args) {

        int i =1;
        while (i++ < 9) {
            int j =0;
            while (j++ < 9) {
                System.out.print(i+ "*"+ j +"=" + i*j +"\t");
            }
            System.out.println();
        };
    }
}
