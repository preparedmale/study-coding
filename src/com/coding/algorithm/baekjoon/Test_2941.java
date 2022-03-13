package com.coding.algorithm.baekjoon;

import java.util.Scanner;

/**
 * Test_5622 explanation
 *
 * @author preparedmale@gmail.com
 * @since 2022.03.12
 * <p>
 * !! When submitting this code to 'Baekjun', you must change the class name to 'Main'.
 */
public class Test_2941 {
    public static void main(String[] args) {
        Test_2941 test = new Test_2941();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(test.solution(scanner.nextLine()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String solution(String message) {
        message = message.replace("c=", "#")
                .replace("c-", "#")
                .replace("dz=", "#")
                .replace("d-", "#")
                .replace("lj", "#")
                .replace("nj", "#")
                .replace("s=", "#")
                .replace("z=", "#");

        return String.valueOf(message.length());
    }
}
