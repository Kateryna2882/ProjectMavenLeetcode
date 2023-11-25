package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JewelsAndStonesTest {

    @ParameterizedTest
    @MethodSource("provideTestData")
    public void testNumJewelsInStones(String jewels, String stones, int expected) {
        assertEquals(expected, JewelsAndStones.numJewelsInStones(jewels, stones));
    }

    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of("aA", "aAAbbbb", 3),
                Arguments.of("z", "ZZ", 0)
        );
    }
}