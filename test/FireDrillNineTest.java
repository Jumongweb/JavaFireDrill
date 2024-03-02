import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillNineTest {
    @Test
    public void testThatMyAgeWillReturn1(){
        assertEquals(1, FireDrillNine.returnAge("12/12/2022"));
        assertEquals(0, FireDrillNine.returnAge("21/02/2024"));
        assertEquals(1, FireDrillNine.returnAge("12/12/2022"));
    }
}
