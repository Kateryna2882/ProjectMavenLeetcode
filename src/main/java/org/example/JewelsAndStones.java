package org.example;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        StringBuilder result = new StringBuilder();
        result.append(jewels);

        for (char c : stones.toCharArray()) {
            if (result.toString().contains(String.valueOf(c)))
                count++;
        }

        return count;
    }
}

