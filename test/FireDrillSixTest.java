import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillSixTest {
    @Test
    public void testThatMyArrayCanConvertValueToBinary(){
        FireDrillSix fireDrillSix = new FireDrillSix();
        int[] sample = {4, 5, 8, 8, 8, 2, 9};
        int[] output = {0, 1, 0, 0, 0, 0, 1};
        assertArrayEquals(output, fireDrillSix.arrayToBinary(sample));
    }

    @Test
    public void testThatMyArrayCanConvertValueToBinaryWithTernary(){
        FireDrillSix fireDrillSix = new FireDrillSix();
        int[] sample = {4, 5, 8, 8, 8, 2, 9};
        int[] output = {0, 1, 0, 0, 0, 0, 1};
        assertArrayEquals(output, fireDrillSix.convertToBinaryWithTernary(sample));
    }
}
