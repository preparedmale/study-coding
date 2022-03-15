package com.coding.algorithm.baekjoon;

import java.util.Scanner;

/**
 * 2292 explanation
 *
 * @author preparedmale@gmail.com
 * @since 2022.03.15
 * <p>
 * !! When submitting this code to 'Baekjun', you must change the class name to 'Main'.
 */
public class Test_2292 {
    public static void main(String[] args) {
        Test_2292 test = new Test_2292();

        Scanner scanner = new Scanner(System.in);

        try {
            Integer roomNumber = scanner.nextInt();

            System.out.println(test.solution(roomNumber));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private int solution(int roomNumber) {
        int x = 1;
        int i;
        for (i = 1; x < roomNumber; i ++) {
            x = x + (i * 6);
        }

        return i;
    }
}
