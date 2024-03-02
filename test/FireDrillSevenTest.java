import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillSevenTest {
    @Test
    public void testThatMyArrayCanConvertValueToBinary(){
        FireDrillSeven fireDrillSeven = new FireDrillSeven();
        int[] sample = {4, 5, 8, 8, 8, 2, 9};
        boolean[] output = {false, true, false, false, false, false, true};
        assertArrayEquals(output, fireDrillSeven.arrayToBinary(sample));
    }

    @Test
    public void testThatMyArrayCanConvertValueToBinaryWithTernary(){
        FireDrillSeven fireDrillSeven = new FireDrillSeven();
        int[] sample = {4, 5, 8, 8, 8, 2, 9};
        boolean[] output = {false, true, false, false, false, false, true};
        assertArrayEquals(output, fireDrillSeven.convertToBinaryWithTernary(sample));
    }

    @Test
    public void testThatMyArrayCanConvertValueToBoolean(){
        FireDrillSeven fireDrillSeven = new FireDrillSeven();
        int[] sample = {4, 5, 8, 8, 8, 2, 9};
        boolean[] output = {false, true, false, false, false, false, true};
        assertArrayEquals(output, fireDrillSeven.covertThirdChance(sample));
    }

    @Test
    public void testFourthChance(){
        FireDrillSeven fireDrillSeven = new FireDrillSeven();
        int[] sample = {4, 5, 8, 8, 8, 2, 9};
        boolean[] output = {false, true, false, false, false, false, true};
        assertArrayEquals(output, fireDrillSeven.covertFourthChance(sample));
    }
}
