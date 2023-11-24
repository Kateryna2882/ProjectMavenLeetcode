package leetcode3;

import java.util.HashMap;
import java.util.Map;

public class BalloonSolver {

    public static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> charCount = new HashMap<>();
        char[] balloonChars = {'b', 'a', 'l', 'o', 'n'};

        for (char ch : text.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        charCount.put('l', charCount.getOrDefault('l', 0) / 2);
        charCount.put('o', charCount.getOrDefault('o', 0) / 2);

        int minInstances = Integer.MAX_VALUE;
        for (char balloonChar : balloonChars) {
            minInstances = Math.min(minInstances, charCount.getOrDefault(balloonChar, 0));
        }

        return minInstances;
    }

    public static void main(String[] args) {

        System.out.println(maxNumberOfBalloons("nlaebolko")); // 1
        System.out.println(maxNumberOfBalloons("loonbalxballpoon")); // 2
        System.out.println(maxNumberOfBalloons("leetcode")); // 0
        System.out.println(maxNumberOfBalloons("balon")); // 0
    }
}