package mySet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {
    private MySet mySet;

    @BeforeEach
    public void setUp(){
        mySet = new MySet();
    }

    @Test
    public void testThatMySetIsEmpty(){
        assertTrue(mySet.isEmpty());
    }

    @Test
    public void testThatMySetCanAddItem(){
        assertTrue(mySet.isEmpty());
        mySet.add("Chibuzor");
        assertFalse(mySet.isEmpty());
    }

    @Test
    public void testThatMySetCanRemoveItem(){
        assertTrue(mySet.isEmpty());
        mySet.add("Chibuzor");
        assertFalse(mySet.isEmpty());
        mySet.remove("Chibuzor");
        assertTrue(mySet.isEmpty());
    }

    @Test void testThatMySetCanReturnItsSize(){
        assertTrue(mySet.isEmpty());
        mySet.add("Chibuzor");
        mySet.add("Beejay");
        mySet.add("Solomon");
        assertFalse(mySet.isEmpty());
        assertEquals(3, mySet.size());
    }

    @Test
    public void testAddThreeElement_DeleteOneAndTheSizeIsTwo(){
        assertTrue(mySet.isEmpty());
        mySet.add("Chibuzor");
        mySet.add("Beejay");
        mySet.add("Solomon");
        assertFalse(mySet.isEmpty());
        assertEquals(3, mySet.size());

        mySet.remove("Solomon");
        assertEquals(2, mySet.size());
    }

    @Test
    public void testToSeeIfAnItemExistInMySet(){
        assertTrue(mySet.isEmpty());
        mySet.add("Chibuzor");
        mySet.add("Beejay");
        mySet.add("Solomon");
        assertFalse(mySet.isEmpty());

        assertTrue(mySet.contain("Chibuzor"));
    }

    @Test
    public void testThatMySetReturnFalseIfAnItemIsNotInTheSet(){
        assertTrue(mySet.isEmpty());
        mySet.add("Chibuzor");
        mySet.add("Beejay");
        mySet.add("Solomon");
        assertFalse(mySet.isEmpty());

        assertThrows(NullPointerException.class, ()->mySet.contain("Unknown"));
    }

    @Test
    public void testThatMySetCannotRemoveElementThatDoesNotExistInTheSet(){
        assertTrue(mySet.isEmpty());
        mySet.add("Chibuzor");
        mySet.add("Beejay");
        mySet.add("Solomon");
        assertFalse(mySet.isEmpty());
        assertEquals(3, mySet.size());
        assertEquals(3, mySet.size());

        assertThrows(NullPointerException.class, ()->mySet.remove("General"));
    }

    @Test
    public void testThatMySetCannotCannotHaveTheSameElement(){
        assertTrue(mySet.isEmpty());
        mySet.add("Chibuzor");
        mySet.add("Beejay");
        mySet.add("Solomon");
        mySet.add("Chibuzor");
        assertFalse(mySet.isEmpty());
        assertEquals(3, mySet.size());
        //mySet.remove2("Gene");
        assertEquals(3, mySet.size());
    }

    @Test
    public void testThatMySetCannotCanClearAllItem(){
        assertTrue(mySet.isEmpty());
        mySet.add("Chibuzor");
        mySet.add("Beejay");
        mySet.add("Solomon");
        assertFalse(mySet.isEmpty());
        assertEquals(3, mySet.size());
        mySet.clear();
        System.out.println(mySet.displaySet());
        assertEquals(0, mySet.size());
    }

    @Test
    public void testThatMySetCanAddMultiplyItems(){
        assertTrue(mySet.isEmpty());
        mySet.add("Solomon");
        mySet.addAll2("Chibuzor", "Beejay", "Solomon", "Chibuzor");
        assertEquals(4, mySet.size());
    }

}
