import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinMixDifferTest {
    @Test
    public void testThatListReturnMinMaxDifference6(){
        int[] array = {2,4,5,7,8};
        int[] output = {6};
        assertArrayEquals(output, MinMixDiffer.getDifference(array));
    }

    @Test
    public void testThatListReturnMinMaxDifference8(){
        int[] array = {2,2,3,4,9};
        int[] output = {7};
        assertArrayEquals(output, MinMixDiffer.getDifference(array));
    }
}