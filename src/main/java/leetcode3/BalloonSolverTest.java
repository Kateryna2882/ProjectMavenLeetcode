package leetcode3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BalloonSolverTest {

    @Test
    public void testMaxNumberOfBalloons() {
        assertEquals(1, BalloonSolver.maxNumberOfBalloons("nlaebolko"));
        assertEquals(2, BalloonSolver.maxNumberOfBalloons("loonbalxballpoon"));
        assertEquals(0, BalloonSolver.maxNumberOfBalloons("leetcode"));
        assertEquals(0, BalloonSolver.maxNumberOfBalloons("balon"));
    }
}