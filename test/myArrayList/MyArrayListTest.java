package myArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {
    private static MyArrayList myArrayList;

    @BeforeEach
    public void setUp(){
        myArrayList = new MyArrayList();
    }

    @Test
    public void testThatArrayIsEmpty(){
        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testThatArrayCanAddElement(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("G-string");
        assertFalse(myArrayList.isEmpty());
    }

    @Test
    public void testThatListCanGetItem(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("G-string");
        myArrayList.add("A-string");
        assertFalse(myArrayList.isEmpty());

        assertEquals("G-string", myArrayList.get(0));
        assertEquals("A-string", myArrayList.get(1));
    }

    @Test
    public void testThatListTwoItemAreInTheList(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("G-string");
        myArrayList.add("A-string");
        assertFalse(myArrayList.isEmpty());

        assertEquals(2, myArrayList.size());
    }

    @Test
    public void testThatListCanRemoveItem(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("G-string");
        assertFalse(myArrayList.isEmpty());
        myArrayList.add("A-string");
        assertEquals(2, myArrayList.size());
        myArrayList.remove("G-string");

        assertEquals(1, myArrayList.size());
    }

    @Test
    public void testThatIHaveThreeElement_RemoveFromTheMiddleAndTheNextIndexReplaceIt(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("G-string");
        assertFalse(myArrayList.isEmpty());
        myArrayList.add("A-string");
        myArrayList.add("D-string");
        assertEquals("A-string", myArrayList.get(1));

        myArrayList.remove("A-string");
        assertEquals("D-string", myArrayList.get(1));
    }

    @Test
    public void testThatMyListHasOneItem_RemoveAndIsEmpty(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("G-string");
        assertFalse(myArrayList.isEmpty());
        myArrayList.remove("G-string");

        assertTrue(myArrayList.isEmpty());
    }

    @Test
    public void testThatMyListCanReturnItSize(){
        assertTrue(myArrayList.isEmpty());
        assertEquals(0, myArrayList.size());

        myArrayList.add("G-string");
        assertFalse(myArrayList.isEmpty());
        myArrayList.add("A-string");
        myArrayList.add("D-string");

        assertEquals(3, myArrayList.size());
    }

    @Test
    public void testThatMyListCanRemoveIndex(){
        assertTrue(myArrayList.isEmpty());
        assertEquals(0, myArrayList.size());

        myArrayList.add("G-string");
        myArrayList.add("A-string");
        myArrayList.add("D-string");
        assertFalse(myArrayList.isEmpty());
        assertEquals(3, myArrayList.size());

        assertEquals("A-string", myArrayList.get(1));
        myArrayList.removeIndex(1);
        assertEquals("D-string", myArrayList.get(1));
    }

    @Test
    public void testThatMyArrayThrowExpection_WhenITryToRemoveElementNotInTheArray(){
        assertTrue(myArrayList.isEmpty());
        assertEquals(0, myArrayList.size());

        myArrayList.add("G-string");
        myArrayList.add("A-string");
        myArrayList.add("D-string");
        assertFalse(myArrayList.isEmpty());
        assertThrows(ArrayIndexOutOfBoundsException.class, ()->myArrayList.remove("T-string"));
    }

    @Test
    public void testThatMyArrayPutArrayInAnIndex(){
        assertTrue(myArrayList.isEmpty());
        assertEquals(0, myArrayList.size());

        myArrayList.add("G-string");
        myArrayList.add("A-string");
        myArrayList.add("D-string");
        assertEquals("A-string", myArrayList.get(1));
        myArrayList.insert(1, "Django");
        assertEquals("Django", myArrayList.get(1));
        assertEquals("A-string", myArrayList.get(2));
    }


    @Test
    public void testThatMyArrayMyArrayChangeContainerWhenItIsFull(){
        assertTrue(myArrayList.isEmpty());
        assertEquals(0, myArrayList.size());

        myArrayList.add("G-string");
        myArrayList.add("R-string");
        myArrayList.add("A-string");
        myArrayList.add("D-string");
        myArrayList.add("E-string");
        myArrayList.add("s-string");
        myArrayList.add("Y-string");
        assertFalse(myArrayList.isEmpty());
        assertEquals(7, myArrayList.size());
    }

}
