package com.coding.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 10250 explanation
 *
 * @author preparedmale@gmail.com
 * @since 2022.03.19
 * <p>
 * !! When submitting this code to 'Baekjun', you must change the class name to 'Main'.
 */
public class Test_10250 {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String readLine = bufferedReader.readLine();

        int playTime = Integer.parseInt(readLine);

        StringTokenizer stringTokenizer;
        while(true) {
            readLine = bufferedReader.readLine();
            stringTokenizer = new StringTokenizer(readLine, " ");
            int h = Integer.parseInt(stringTokenizer.nextToken());
            int w = Integer.parseInt(stringTokenizer.nextToken());
            int n = Integer.parseInt(stringTokenizer.nextToken());

            solution(h, w, n);
            playTime--;
            if (playTime == 0) {
                break;
            }
        }
    }

    /**
     *
     * @param h // 호텔의 높이
     * @param w // 한 층의 방 수
     * @param n // 손님 입장 순서 번호
     */
    public static void solution(double h, double w, double n) {
        int allocatedFloor = (int) (n % h) * 100;
        if (allocatedFloor == 0) {
            allocatedFloor = (int) h * 100;
        }

        int allocatedRoom = (int) Math.ceil(n / h);

        System.out.println(allocatedFloor + allocatedRoom);// answer
    }
}
