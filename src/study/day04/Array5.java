package study.day04;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        int[] copyFrom = {1, 2, 3};
        int[] copyTo = Arrays.copyOf(copyFrom, copyFrom.length);

        for (int i : copyTo) {
            System.out.println(i);
        }

        copyTo = Arrays.copyOf(copyFrom, 2);
        for (int i : copyTo) {
            System.out.println(i);
        }

    }
}
