package study.babyLion;

import java.util.Scanner;

public class Switch2 {
    public static void switch2(int x) {
        switch(x) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            case 4:
                System.out.println("Apr");
                break;
            case 5:
                System.out.println("May");
                break;
            default:
                System.out.println("정보 없음");

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("달 입력하시오");
        int month = sc.nextInt();
        switch2(month);


    }
}
