package com.coding.algorithm.baekjoon;

import java.util.Scanner;

/**
 * 1193 explanation
 *
 * @author preparedmale@gmail.com
 * @since 2022.03.16
 * <p>
 * !! When submitting this code to 'Baekjun', you must change the class name to 'Main'.
 */
public class Test_1193 {
    public static void main(String[] args) {
        Test_1193 test = new Test_1193();

        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();

            System.out.println(test.solution(x));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String solution(int x) {
        String fraction = "";
        //  1(1/1): index 1,  arraySize 1
        //  2(1/2),  3(2/1): index 2,  arraySize 3
        //  6(1/3),  5(2/2), 4(3/1): index 3, arraySize 6
        //  7(1/4),  8(2/3), 9(3/2), 10(4/1): index 4, arraySize 10
        int index = 0;
        int arraySize = 0;
        while(true) {
            index ++;

            arraySize = arraySize + index;
            if (arraySize >= x) {
                break;
            }
        }

        int denominator = (index + x) % arraySize; // 분자
        int numerator = (index + 1) - denominator;

        if (index == 1) {
            fraction = "1/1";
        } else if ((index % 2) == 0) {
            fraction = denominator + "/" + numerator;
        } else {
            fraction = numerator + "/" + denominator;
        }

        return fraction;
    }
}
