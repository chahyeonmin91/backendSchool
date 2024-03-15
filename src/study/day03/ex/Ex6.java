package study.day03.ex;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total =0;
        int num;

        do {
            System.out.println("정수 입력");
             num = sc.nextInt();
            total += num;
        } while (num!=0);
        System.out.println(total);
    }
}
