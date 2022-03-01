package com.coding.algorithm.backjoon;
import java.util.*;

public class Test_1152 {
    public static void main(String[] args) {
        Test_1152 test = new Test_1152();
        Scanner scanner = new Scanner(System.in);
        System.out.println(test.solution(scanner.nextLine()));

    }

    private String solution (String message) {
        message = message.trim();
        StringTokenizer st = new StringTokenizer(message);
        int count = 0;
        while(st.hasMoreTokens()) {
            st.nextToken();
            count++;
        }

        return String.valueOf(count);
    }
}
