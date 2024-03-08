package myString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStringTest {
    @Test
    public void testThatCharsEqualsMyString(){
        MyString myString = new MyString('c', 'h', 'i');
        assertEquals(myString, "chi");
    }
}
