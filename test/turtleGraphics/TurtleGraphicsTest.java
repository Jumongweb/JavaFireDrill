package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.text.Position;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleGraphicsTest {

    private TurtleGraphics turtleGraphics;
    @BeforeEach
    public void intializeTurtle(){
        turtleGraphics = new TurtleGraphics();
    }
    @Test
    public void testThatPenIsUp(){
        assertTrue(turtleGraphics.isPenUp());
    }

    @Test
    public void testThatPenIsUp_TakePenDown(){
        assertTrue(turtleGraphics.isPenUp());
        turtleGraphics.penDown();
        assertFalse(turtleGraphics.isPenUp());
    }

    @Test
    public void testThatPenIsDown_takeItBackUp(){
        assertTrue(turtleGraphics.isPenUp());
        turtleGraphics.penDown();
        assertFalse(turtleGraphics.isPenUp());
        turtleGraphics.penUp();
        assertTrue(turtleGraphics.isPenUp());
    }

    @Test
    public void testThatTurtleFaceEastTurnLeftTurtleFacesNorth(){
        assertSame(EAST, turtleGraphics.currentDirection());
        turtleGraphics.turnLeft();
        assertSame(NORTH, turtleGraphics.currentDirection());
    }

    @Test
    public void testThatTurtleFaceNorthTurnLeftTurtleFaceWest(){
        assertSame(EAST, turtleGraphics.currentDirection());
        turtleGraphics.turnLeft();
        turtleGraphics.turnLeft();
        assertSame(WEST, turtleGraphics.currentDirection());
    }

    @Test
    public void testThatTurtleFaceWestTurnLeftTurtleFaceSouth(){
        assertSame(EAST, turtleGraphics.currentDirection());
        turtleGraphics.turnLeft();
        turtleGraphics.turnLeft();
        turtleGraphics.turnLeft();
        assertSame(SOUTH, turtleGraphics.currentDirection());
    }

    @Test
    public void testThatTurtleFaceSouthTurnLeftTurtleFaceEast(){
        assertSame(EAST, turtleGraphics.currentDirection());
        turtleGraphics.turnLeft();
        turtleGraphics.turnLeft();
        turtleGraphics.turnLeft();
        turtleGraphics.turnLeft();
        assertSame(EAST, turtleGraphics.currentDirection());
    }

    @Test
    public void testThatTurtleIsFacingEastTurnRightTurtleFacesSouth(){
        assertSame(EAST, turtleGraphics.currentDirection());
        turtleGraphics.turnRight();
        assertSame(SOUTH, turtleGraphics.currentDirection());
    }

    @Test
    public void testThatTurtleIsFacingSouthTurnRightTurtleFacesWest(){
        assertSame(EAST, turtleGraphics.currentDirection());
        turtleGraphics.turnRight();
        turtleGraphics.turnRight();
        assertSame(WEST, turtleGraphics.currentDirection());
    }

    @Test
    public void testThatTurtleIsFacingWestTurnRightTurtleFacesNorth(){
        assertSame(EAST, turtleGraphics.currentDirection());
        turtleGraphics.turnRight();
        turtleGraphics.turnRight();
        turtleGraphics.turnRight();
        assertSame(NORTH, turtleGraphics.currentDirection());
    }

    @Test
    public void testThatTurtleIsFacingNorthTurnRightTurtleFacesEast(){
        assertSame(EAST, turtleGraphics.currentDirection());
        turtleGraphics.turnRight();
        turtleGraphics.turnRight();
        turtleGraphics.turnRight();
        turtleGraphics.turnRight();
        assertSame(EAST, turtleGraphics.currentDirection());
    }

    @Test
    public void testThatTurtleIsFacingEastTurnRightOnceIsSouth_TurnLeftTwiceIsNorth(){
        assertSame(EAST, turtleGraphics.currentDirection());
        turtleGraphics.turnRight();
        turtleGraphics.turnLeft();
        turtleGraphics.turnLeft();
        assertSame(NORTH, turtleGraphics.currentDirection());
    }

    @Test
    public void testThatTurtleIsFaceEastAndItCanMoveForward(){
        assertSame(EAST, turtleGraphics.currentDirection());
        assertEquals(new turtlePosition(0, 0), turtleGraphics.getCurrentPosition());
        //turtleGraphics.moveForward(5, sketchBoard);
    }


}
