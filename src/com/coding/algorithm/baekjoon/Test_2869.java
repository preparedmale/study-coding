package com.coding.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 2869 explanation
 *
 * @author preparedmale@gmail.com
 * @since 2022.03.16
 * <p>
 * !! When submitting this code to 'Baekjun', you must change the class name to 'Main'.
 */
public class Test_2869 {
    public static void main(String[] args) throws IOException {
        Test_2869 test = new Test_2869();

        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");

            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double v = Double.parseDouble(st.nextToken());

            System.out.println(test.solution(a, b, v));

    }

    private int solution(double a, double b, double v) {
        // a: 낮에 올라갈 수 있는 높이
        // b: 밤에 미끄러지는 거리
        // v: 막대의 높이
        int answer =  (int) Math.ceil((v - b) / (a - b));

        return answer;
    }
}
