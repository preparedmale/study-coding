package com.coding.algorithm.backjoon;
import java.util.*;

public class Test_1157 {
    public static void main(String[] args) {
        Test_1157 test = new Test_1157();
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println(test.solution(scanner.next()));

    }

    private String solution (String word) {
        word = word.toUpperCase();

        Map<Character, Integer> alphabetMap = new HashMap<>();
        for (int i = 0; i < word.length(); i ++) {
            char alphabet = word.charAt(i);

            Integer count = alphabetMap.get(alphabet);
            if (count == null) {
                alphabetMap.put(alphabet, 1);
                continue;
            }

            alphabetMap.put(alphabet, count + 1);
        }


        System.out.println(alphabetMap);
        Iterator<Character> keySet = alphabetMap.keySet().iterator();

        int maxCount = 0;
        char maxKey = 0;
        // 가장 큰 값 찾기
        while (keySet.hasNext()) {
            char key = keySet.next();
            int count = alphabetMap.get(key);

            if (count > maxCount) {
                maxCount = count;
                maxKey = key;
            }
        }
        Collection<Integer> alphabetValue = alphabetMap.values();
        alphabetValue.remove(maxCount);
        if (alphabetValue.contains(maxCount)) {
            return "?";
        }


        return String.valueOf(maxKey);
    }
}
