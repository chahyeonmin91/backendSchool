package study.day03.ex;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand = (int) (Math.random()*100);
        while (true) {
            System.out.println("숫자를 고르시오");
            int num = sc.nextInt();
            if (num == rand) {
                System.out.println("정답");
                break;
            } else if (num > rand) {
                System.out.println("다운");
            } else {
                System.out.println("업");
            }
        }


    }
}
