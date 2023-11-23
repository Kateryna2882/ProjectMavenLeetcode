package org.example;

public class JewelsAndStones {
    public static int numJewelsInStones(String jewels, String stones) {
        StringBuilder result = new StringBuilder();

        stones.chars()
                .filter(jewels::contains)
                .forEach(result::append);

        return result.length();
    }

    public static void main(String[] args) {
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels1, stones1)); // Output: 3

        String jewels2 = "z";
        String stones2 = "ZZ";
        System.out.println(numJewelsInStones(jewels2, stones2)); // Output: 0
    }
}

