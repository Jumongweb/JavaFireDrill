package turtleGraphics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TurtleGraphicsTest {
    @Test
    public void testThatPenIsUp(){
        TurtleGraphics turtleGraphics = new TurtleGraphics();
        assertTrue(turtleGraphics.isPenUp());
    }

    @Test
    public void testThatPenCanBeTakenDown(){
        TurtleGraphics turtleGraphics = new TurtleGraphics();
        assertTrue(turtleGraphics.isPenUp());
        turtleGraphics.penDown();
        assertFalse(turtleGraphics.isPenUp());
    }

    @Test
    public void testThatPenIsDown_takeItBackUp(){
        TurtleGraphics turtleGraphics = new TurtleGraphics();
        assertTrue(turtleGraphics.isPenUp());
        turtleGraphics.penDown();
        assertFalse(turtleGraphics.isPenUp());
        turtleGraphics.penUp();
        assertTrue(turtleGraphics.isPenUp());
    }
}
