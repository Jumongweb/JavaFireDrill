package dietel_c15.task;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CountDigitTest {

    @Test
    public void testCountDigit() throws IOException {
        String location = "C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\output.txt";
        assertEquals(6, CountDigit.countDigit(location));
    }

    @Test
    public void testCountSentence() throws Exception{
        String location = "C:\\Users\\DELL\\IdeaProjects\\javaFireDrillOne\\src\\dietel_c15\\output2.txt";
        assertEquals(3, CountDigit.countSentence(location));
    }
}