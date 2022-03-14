package com.coding.algorithm.baekjoon;

import java.util.Scanner;

/**
 * Test_1316 explanation
 *
 * @author preparedmale@gmail.com
 * @since 2022.03.14
 * <p>
 * !! When submitting this code to 'Baekjun', you must change the class name to 'Main'.
 */
public class Test_1316 {
    public static void main(String[] args) {
        Test_1316 test = new Test_1316();

        Scanner scanner = new Scanner(System.in);

        try {
            Integer playTime = Integer.valueOf(scanner.nextLine());
            int groupWordCount = 0;
            for (int i = 0; i < playTime; i ++) {
                if(test.solution(scanner.nextLine())) {
                    groupWordCount++;
                }
            }

            System.out.println(groupWordCount);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean solution(String message) {
        char[] messageCharArray = message.toCharArray();
        for (int i = 0; i < messageCharArray.length - 1; i ++) {
            if (messageCharArray[i] == messageCharArray[i + 1]) {
                continue;
            }

            else {
                if (message.indexOf(messageCharArray[i], i + 1) > -1) {
                    return false;
                }
            }
        }

        return true;
    }
}
