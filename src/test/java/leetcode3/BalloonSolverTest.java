package leetcode3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalloonSolverTest {
    @ParameterizedTest
    @MethodSource("provideStrings")
    public void testMaxNumberOfBalloons(String input, int expected) {
        assertEquals(expected, BalloonSolver.maxNumberOfBalloons(input));
    }

    private static Stream<Arguments> provideStrings() {
        return Stream.of(
                Arguments.of("nlaebolko", 1),
                Arguments.of("loonbalxballpoon", 2),
                Arguments.of("leetcode", 0),
                Arguments.of("balon", 0)
        );
    }
}