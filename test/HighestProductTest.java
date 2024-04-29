import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestProductTest {

    @Test
    public void testThatFunctionReturnTheHighestProduct(){
        HighestProduct highestProduct = new HighestProduct();
        int[] array = {-10};
        int[] empty = new int[0];
        assertEquals(-10, highestProduct.getHighestProduct(array));
        assertEquals(0, highestProduct.getHighestProduct(empty));
    }

    @Test
    public void testThatFunctionReturnTheHighestNegativeProduct(){
        HighestProduct highestProduct = new HighestProduct();
        int[] array = {-2,-3};
        int[] array2 = {1,-5};
        assertEquals(6, highestProduct.getHighestProduct(array));
        assertEquals(-5, highestProduct.getHighestProduct(array2));
    }
}
