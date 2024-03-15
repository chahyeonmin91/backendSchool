package study.day04;

public class Array3 {
    public static void main(String[] args) {
        int[] iarr = new int[5];

        for (int i = 0; i < iarr.length; i++) {
            iarr[i] = i+1;
            System.out.println("iarr[i] = " + iarr[i]);
        }
    }
}
