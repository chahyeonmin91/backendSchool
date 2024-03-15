package study.day04;

public class Array1 {
    public static void main(String[] args) {
        //선언
        int[] iarr;

        //생성
        iarr = new int[3];

        //이용
        iarr[0] =10;

        System.out.println(iarr[0]);
        System.out.println(iarr[2]);


        int[] arr2 = new int[]{10, 20, 30};
        int[] arr3 = {10, 20, 30};

        //반복문
        for (int i = 0; i < 3; i++) {
            System.out.println(iarr[i]);
        }

    }
}
