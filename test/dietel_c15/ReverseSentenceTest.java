package dietel_c15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseSentenceTest {
    @Test
    public void testThatIHaveASentence(){
        String sample = "It is still a beautiful world";
        String expected = "world beautiful a still is It";
        assertEquals(expected, ReverseSentence.getReversedSentence(sample));
    }
}