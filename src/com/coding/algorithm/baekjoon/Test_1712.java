package com.coding.algorithm.baekjoon;

import java.util.Scanner;

/**
 * Test_1712 explanation
 *
 * @author preparedmale@gmail.com
 * @since 2022.03.15
 * <p>
 * !! When submitting this code to 'Baekjun', you must change the class name to 'Main'.
 */
public class Test_1712 {
    public static void main(String[] args) {
        Test_1712 test = new Test_1712();

        Scanner scanner = new Scanner(System.in);

        try {
            String [] inputNumberStringArray = scanner.nextLine().split(" ");

            System.out.println(test.solution(Integer.valueOf(inputNumberStringArray[0]),
                    Integer.valueOf(inputNumberStringArray[1]),
                    Integer.valueOf(inputNumberStringArray[2])));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int solution(int a, int b, int c) {
        // A = a + B, B = c - b, d = A / B
        int B = c - b;
        if (B <= 0) {
            return -1;
        }

        int A = a + B;
        int d = A / B;
        // d가 음수이면 -1로 고정
        if (d < 0) {
            return -1;
        }

        return d;
    }
}
