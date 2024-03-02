import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillFiveTest {

    @Test
    public void testDoubleMyArrayLength(){
        FireDrillFive fireDrillFive = new FireDrillFive();
        int[] sample = {4,5,8};
        int[] output = {4,5,8,8,10,16};
        // assertArrayEquals(output, fireDrillFive.doubleMyArray(output));
        assertArrayEquals(output, fireDrillFive.secondTry(sample));
    }

    @Test
    public void testArrayShouldReturnArrayDoubleTheLengthAndTheEmptySpaceShouldContainDoubleTheElement(){
        FireDrillFive fireDrillFive = new FireDrillFive();
        int[] sample = {4,5,8};
        int[] output = {4,5,8,8,10,16};
       // assertArrayEquals(output, fireDrillFive.doubleMyArray(output));
        assertArrayEquals(output, fireDrillFive.secondTry(sample));
    }
}
