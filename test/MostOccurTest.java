import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MostOccurTest {
    @Test
    public void testGetMostOccured(){
        int[] input = {2,3,3,3,6,7};
        System.out.println(Arrays.toString(MostOccur.getHighestOccur(input)));
        int[] expected = {3,3};
        assertArrayEquals(expected, MostOccur.getHighestOccur(input));
    }


}
