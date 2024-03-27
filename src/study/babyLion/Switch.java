package study.babyLion;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch(month) {
            case 1:
                System.out.println("1월");
                break;
            case 2:
                System.out.println("2월");
                break;
            case 3:
                System.out.println("3월");
                break;
            case 4:
                System.out.println("4월");
                break;
            case 5:
                System.out.println("5월");
                break;
            default:
                System.out.println("정보 없음");

        }
    }
}
