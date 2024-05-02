import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PositionTest {
    @Test
    public void testThatFunctionReturnThePositionsOfArray(){
        int[] input = {8,10,4,1};
        int[] output = {3,4,2,1};
        assertArrayEquals(output, Position.getPosition(input));
    }

    @Test
    public void testThatFunctionReturnThePositionsOfArrayWithTwoNumbersBeTheSame(){
        int[] input = {8,4,4,1};
        int[] output = {4,2,2,1};
        assertArrayEquals(output, Position.getPosition(input));
    }
}