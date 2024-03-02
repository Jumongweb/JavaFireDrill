package myStack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    private static MyStack myStack;

    @BeforeEach
    public void setUp(){
        myStack = new MyStack(5);
    }

    @Test
    public void testThatMyStackIsEmpty(){
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testThatWhenUserPush_ItIsNoLongerEmpty(){
        assertTrue(myStack.isEmpty());
        myStack.push("3");
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void testThatMyStackCanPeek(){
        assertTrue(myStack.isEmpty());
        myStack.push("3");
        myStack.push("9");

        assertEquals("9", myStack.peek());
    }

    @Test
    public void testToSeeThePoppedElement(){
        assertTrue(myStack.isEmpty());
        myStack.push("3");
        myStack.push("9");
        myStack.push("20");
        assertEquals("20", myStack.pop());
        assertEquals("9", myStack.peek());
    }

    @Test
    public void testThatMyStackCanRemoveElementAndPeekAtTheNextElement(){
        assertTrue(myStack.isEmpty());
        myStack.push("3");
        myStack.push("9");
        myStack.pop();

        assertEquals("3",myStack.peek());
    }

    @Test
    public void testThatMyStackCannotPeekWhenItIsEmpty(){
        assertThrows(EmptyStackException.class, ()->myStack.peek());
    }

    @Test
    public void testToRemoveElementFromMyStack(){
        assertTrue(myStack.isEmpty());
        myStack.push("3");
        assertFalse(myStack.isEmpty());
        myStack.pop();
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void testThatAnEmptyStackCannotBePopped(){
        assertTrue(myStack.isEmpty());
        assertThrows(EmptyStackException.class, ()->myStack.pop());
    }

    @Test
    public void testThatMyStackOverflowWhenElementIsMoreThanItsCapacity(){
        assertTrue(myStack.isEmpty());
        myStack.push("1");
        myStack.push("2");
        myStack.push("3");
        myStack.push("4");
        myStack.push("5");
        assertThrows(StackOverflowError.class, ()->myStack.push("6"));
    }
}
