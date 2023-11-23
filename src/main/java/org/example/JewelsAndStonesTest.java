package org.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JewelsAndStonesTest {

    @Test
    public void testNumJewelsInStones() {
        assertEquals(3, JewelsAndStones.numJewelsInStones("aA", "aAAbbbb"));
        assertEquals(0, JewelsAndStones.numJewelsInStones("z", "ZZ"));
    }
}