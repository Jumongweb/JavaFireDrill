import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutPlusTest {
    @Test
    public void testThatFunctionReturnSumWithoutPlusOperator(){
        assertEquals(0, WithoutPlus.getSumWithoutPlus(-5,5));
    }
    @Test
    public void testThatFunctionReturnSumWithoutPlusOperator2(){
        assertEquals(10, WithoutPlus.getSumWithoutPlus(5,5));
    }

}