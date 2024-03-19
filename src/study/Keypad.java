package study;

import java.util.*;
public class Keypad {
    public String keypad(int[] numbers, String hand) {
        String ans = " ";
        int left =10;
        int right =12;
        for (int num : numbers) {
            if (num == 1 || num == 4 || num == 7) {
                ans += "L";
                left =num;
            } else if (num == 3 || num == 6 || num == 9) {
                ans += "R";
                right = num;
            } else {
                if(num==0) num = 11;

                int leftdist = Math.abs(num-left)/3+Math.abs(num-left)%3;
                int rightdist = Math.abs(num-right)/3+Math.abs(num-right)%3;

                if (leftdist < rightdist) {
                    ans += "L";
                    left = num;
                } else if (leftdist > rightdist) {
                    ans += "R";
                    right = num;
                } else {
                    if (hand.equals("left")) {
                        ans += "L";
                        left = num;
                    } else {
                        ans += "R";
                        right = num;
                    }
                }

            }
        }
        return ans;
    }
}
