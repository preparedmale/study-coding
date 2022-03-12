package com.coding.algorithm.beckjoon;

import java.util.*;

/**
 * Test_5622 explanation
 *
 * @author preparedmale@gmail.com
 * @since 2022.03.12
 *
 * !! When submitting this code to 'Baekjun', you must change the class name to 'Main'.
 */
public class Test_5622 {
    public static void main(String[] args) {
        Test_5622 test = new Test_5622();

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(test.solution(scanner.nextLine()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String solution(String message) {
        char[] messageCharArray = message.toCharArray();

        Map<String, Integer> dialogTimeMap = new LinkedHashMap<>();
        dialogTimeMap.put("", 1);

        dialogTimeMap.put("A", 3);// 2
        dialogTimeMap.put("B", 3);
        dialogTimeMap.put("C", 3);

        dialogTimeMap.put("D", 4);// 3
        dialogTimeMap.put("E", 4);
        dialogTimeMap.put("F", 4);

        dialogTimeMap.put("G", 5);// 4
        dialogTimeMap.put("H", 5);
        dialogTimeMap.put("I", 5);

        dialogTimeMap.put("J", 6);// 5
        dialogTimeMap.put("K", 6);
        dialogTimeMap.put("L", 6);

        dialogTimeMap.put("M", 7);// 6
        dialogTimeMap.put("N", 7);
        dialogTimeMap.put("O", 7);

        dialogTimeMap.put("P", 8);// 7
        dialogTimeMap.put("Q", 8);
        dialogTimeMap.put("R", 8);
        dialogTimeMap.put("S", 8);

        dialogTimeMap.put("T", 9);// 8
        dialogTimeMap.put("U", 9);
        dialogTimeMap.put("V", 9);

        dialogTimeMap.put("W", 10);// 9
        dialogTimeMap.put("X", 10);
        dialogTimeMap.put("Y", 10);
        dialogTimeMap.put("Z", 10);

        int minTime = 0;
        for (char alphabet : messageCharArray) {
            minTime += dialogTimeMap.get(String.valueOf(alphabet));
        }

        return String.valueOf(minTime);
    }
}
