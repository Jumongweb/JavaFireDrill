import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroTest {
    @Test
    public void testMoveZero() {
        MoveZero moveZero = new MoveZero();
        int[] input = {3,2,0,-1,7,0,8};
        int[] output = {3,2,-1,7,8,0,0};
        assertArrayEquals(output, moveZero.getArray(input));
    }
}