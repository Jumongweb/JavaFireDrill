import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FireDrillEightTest {
    @Test
    public void testThatMyArrayReturnZero(){
        FireDrillEight fireDrillEight = new FireDrillEight();
        int[] sample = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] output = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        assertArrayEquals(output, fireDrillEight.arrayDefault(sample));
    }
}
