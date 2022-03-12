package com.coding.algorithm.backjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test_2908 {
    public static void main(String[] args) {
        Test_2908 test = new Test_2908();
        Scanner scanner = new Scanner(System.in);
        System.out.println(test.solution(scanner.nextLine()));

    }

    private String solution (String message) {
        message = message.trim();
        StringTokenizer st = new StringTokenizer(message);
        int maxNum = 0;

        while(st.hasMoreTokens()) {

            String numbers = st.nextToken(" ");
            String reverseNumber = " ";
            char[] numberCharArray = numbers.toCharArray();
            for (int i = numberCharArray.length - 1; i >= 0; i--) {
                reverseNumber += String.valueOf(numberCharArray[i]);
            }
            reverseNumber = reverseNumber.trim();
            if (maxNum < Integer.valueOf(reverseNumber)) {
                maxNum = Integer.valueOf(reverseNumber);
            }
        }

        return String.valueOf(maxNum);
    }
}
