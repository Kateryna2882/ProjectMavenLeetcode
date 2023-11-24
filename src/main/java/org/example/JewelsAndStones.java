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

    public static void main(String[] args) {
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels1, stones1));

        String jewels2 = "z";
        String stones2 = "ZZ";
        System.out.println(numJewelsInStones(jewels2, stones2));
    }
}

