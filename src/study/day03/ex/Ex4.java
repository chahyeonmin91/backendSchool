package study.day03.ex;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        //사용자로부터 정수 n을 입력받아, 1부터 n까지의 곱(팩토리얼)을 계산하는 프로그램을
        // 작성하세요. 예를 들어, 사용자가 5를 입력하면, 5! = 120을 출력하세요.
        // for 또는 while 루프를 사용하여 구현하세요.
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int total =1;
        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        System.out.println(num+ "! = "+ total);
    }
}
