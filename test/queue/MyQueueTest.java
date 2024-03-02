package queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {

    private MyQueue myQueue;

    @BeforeEach
    public void setUp(){
        myQueue = new MyQueue(5);
    }
    @Test
    public void testThatIHaveAQueueAndItIsEmpty(){
        assertTrue(myQueue.isEmpty());
    }

    @Test
    public void testThatMyQueueCanAddElement(){
        assertTrue(myQueue.isEmpty());
        myQueue.add("one");
        assertFalse(myQueue.isEmpty());
        assertEquals(1, myQueue.size());
    }

    @Test
    public void testThatMyQueueCanAddMoreThanOneElement(){
        assertTrue(myQueue.isEmpty());
        myQueue.add("one");
        myQueue.add("two");
        assertFalse(myQueue.isEmpty());
        assertEquals(2, myQueue.size());
    }

    @Test
    public void thatThatQueueCanReturnItsSize(){
        assertTrue(myQueue.isEmpty());
        myQueue.add("one");
        myQueue.add(2);
        myQueue.add(4.5);
        assertFalse(myQueue.isEmpty());
        assertEquals(3, myQueue.size());

    }





}