import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FireDrillTenTen {
    @Test
    public void testMinMax(){
        int[] array = {3,4,2,5,1};
        int[] result = {10,14};
        assertArrayEquals(result, FireDrillTen.minMax(array));
    }
}
