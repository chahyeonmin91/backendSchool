package study.day03.ex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //온도 변환기
        Scanner sc = new Scanner(System.in);

        int c = sc.nextInt();
        double f = c * (double) 9 / 5 + 32;
        System.out.println(f);
    }
}
