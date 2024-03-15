package study.day04;

import java.util.Arrays;

public class Array6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 ={1,2,3,4,5,6};

        int compare = Arrays.compare(arr1,arr2);
        System.out.println("compare = " + compare);
    }
}
