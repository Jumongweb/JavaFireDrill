import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class FireDrillThreeTest {

    private FireDrillThree fireDrillThree;


    @BeforeEach
    public void initializeFireDrill(){
        fireDrillThree = new FireDrillThree();
    }

    @Test
    public void testThatArrayCanSaveTenScore() {
        int[] score = new int[10];
        int[] sample = fireDrillThree.taskOne(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int[] output = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(output, sample);
    }

    @Test
    public void testThatArrayCanPrintScoreInVerticalLine(){
        String myArray = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n";

        assertEquals(myArray, fireDrillThree.taskTwo(1,2,3,4,5,6,7,8,9,10));
    }

    @Test
    public void shouldPrintTenScoreInAnArrayInHorizontalLine(){
        int[] score = new int[10];

        String output = "1 2 3 4 5 6 7 8 9 10 ";
        assertEquals(output, fireDrillThree.taskThree(1,2,3,4,5,6,7,8,9,10));
    }

    @Test
    public void shouldReturnArrayAtTheEvenIndex(){
        int[] originalArray = {1,2,3,4,5,6,7,8};
        int[] outputArray = {1,3,5,7};
        assertArrayEquals(outputArray, fireDrillThree.taskFour(originalArray));
    }

    @Test
    public void shouldReturnArrayAtTheOddIndex(){
        int[] originalArray = {1,2,3,4,5,6,7,8};
        int[] outputArray = {2,4,6,8};
        assertArrayEquals(outputArray, fireDrillThree.taskFive(originalArray));
    }

    @Test
    public void shouldReturnSumOfEvenIndex(){
        int[] originalArray = {1,2,3,4,5,6,7,8};
        assertEquals(16, fireDrillThree.taskSix(originalArray));
    }

    @Test
    public void shouldReturnSumOfOddIndex(){
        int[] originalArray = {1,2,3,4,5,6,7,8};
        assertEquals(20, fireDrillThree.taskSeven(originalArray));
    }

    @Test
    public void shouldReturnMinimumInTaskFour(){
        int[] originalArray = {10,2,3,1,4,5,6,7,8};
        assertEquals(3, fireDrillThree.taskEight(originalArray));

    }

    @Test
    public void shouldReturnMinimumInTaskFive(){
        int[] originalArray = {10,2,3,1,4,5,6,7,8};
        assertEquals(1, fireDrillThree.taskNine(originalArray));

    }

    @Test
    public void shouldReturnMaximumInTaskFour(){
        int[] originalArray = {10,2,3,1,4,5,6,7,8};
        assertEquals(10, fireDrillThree.taskTen(originalArray));
    }

    @Test
    public void shouldReturnMaximumInTaskFive(){
        int[] originalArray = {10,2,3,1,4,5,6,7,8};
        assertEquals(7, fireDrillThree.taskEleven(originalArray));
    }

    @Test
    public void shouldReturnElementAtOddIndexSwappedWithElementAtEvenIndex(){
        int[] originalArray = {10,2,3,1,4,5,6,7,8,9};
        int[] output = {2,1,5,7};
        assertEquals(output, fireDrillThree.taskTwelve(originalArray));

    }
}
