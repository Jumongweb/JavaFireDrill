package turtleGraphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.text.Position;

import static org.junit.jupiter.api.Assertions.*;
import static turtleGraphics.Direction.*;

public class TurtleGraphicsTest {

    private TurtleGraphics turtleGraphics;
    private SketchBoard sketchBoard;
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
        turtleGraphics.moveForward(5, sketchBoard);
        assertEquals(new turtlePosition(0, 4), turtleGraphics.getCurrentPosition());
    }

    @Test
    public void testThatTurtleIsFaceEastAndOnColumn4_TurnRightAndMove5Step_TurtleIsOnRow4Column4(){
        assertSame(EAST, turtleGraphics.currentDirection());
        assertEquals(new turtlePosition(0, 0), turtleGraphics.getCurrentPosition());
        turtleGraphics.moveForward(5, sketchBoard);
        turtleGraphics.turnRight();
        assertSame(SOUTH, turtleGraphics.currentDirection());
        turtleGraphics.moveForward(5, sketchBoard);
        assertEquals(new turtlePosition(4, 4), turtleGraphics.getCurrentPosition());
    }

    @Test
    public void testThatTurtleIsOnRow4Column4_MoveForward5StepAndTurtleIsOnRow4Column0(){
        assertSame(EAST, turtleGraphics.currentDirection());
        assertEquals(new turtlePosition(0, 0), turtleGraphics.getCurrentPosition());
        turtleGraphics.moveForward(5, sketchBoard);
        turtleGraphics.turnRight();
        assertSame(SOUTH, turtleGraphics.currentDirection());
        turtleGraphics.moveForward(5, sketchBoard);
        assertEquals(new turtlePosition(4, 4), turtleGraphics.getCurrentPosition());
        turtleGraphics.turnRight();
        assertSame(WEST, turtleGraphics.currentDirection());
        turtleGraphics.moveForward(5, sketchBoard);
        assertEquals(new turtlePosition(4, 0), turtleGraphics.getCurrentPosition());
    }

    @Test
    public void testThatTurtleIsFacingNorthOnRow4Column0_MoveForward5StepAndTurtleIsOnRow0Column0(){
        assertSame(EAST, turtleGraphics.currentDirection());
        assertEquals(new turtlePosition(0, 0), turtleGraphics.getCurrentPosition());
        turtleGraphics.moveForward(5, sketchBoard);
        turtleGraphics.turnRight();
        assertSame(SOUTH, turtleGraphics.currentDirection());
        turtleGraphics.moveForward(5, sketchBoard);
        assertEquals(new turtlePosition(4, 4), turtleGraphics.getCurrentPosition());
        turtleGraphics.turnRight();
        assertSame(WEST, turtleGraphics.currentDirection());
        turtleGraphics.moveForward(5, sketchBoard);
        assertEquals(new turtlePosition(4, 0), turtleGraphics.getCurrentPosition());
        turtleGraphics.turnRight();
        assertSame(NORTH, turtleGraphics.currentDirection());
        turtleGraphics.moveForward(5, sketchBoard);
        assertEquals(new turtlePosition(0, 0), turtleGraphics.getCurrentPosition());
    }

    @Test
    public void testThatBoardIs20By20(){
        int[][] expected = new int[20][20];
        assertArrayEquals(expected, sketchBoard.getBoard());
    }

    @Test
    public void penIsUp_turtleMoveTenTimes_scoreBoardNotMarked() {
        assertTrue(turtleGraphics.isPenUp());
        assertEquals(EAST, turtleGraphics.currentDirection());
        turtleGraphics.moveForward(5, sketchBoard);
        assertEquals(new turtlePosition(0, 4), turtleGraphics.getCurrentPosition());
        /*int[][] expected = sketchBoard.getBoard();
        assertEquals(0, expected[0][0]);
        assertEquals(0, expected[0][1]);
        assertEquals(0, expected[0][2]);
        assertEquals(0, expected[0][3]);
        assertEquals(0, expected[0][4]);
        assertEquals(0, expected[0][5]);
        assertEquals(0, expected[0][6]);
        assertEquals(0, expected[0][7]);
        assertEquals(0, expected[0][8]);
        assertEquals(0, expected[0][9]); */

    }

}
