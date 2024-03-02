package myDiary;

import myDiary.exceptions.InvalidPasswordException;
import myDiary.exceptions.InvalidUsernameException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiariesTest {
    private Diaries diaries;

    @BeforeEach
    public void initializeDiary(){
        diaries = new Diaries();
    }
    @Test
    public void testIHaveADiaryAndItIsEmpty(){
        assertEquals(0, diaries.getNumbersOfDiaries());
    }

    @Test
    public void testThatDiariesCanAddDiary(){
        assertEquals(0, diaries.getNumbersOfDiaries());
        diaries.add("username", "password");
        assertEquals(1, diaries.getNumbersOfDiaries());
    }
    @Test
    public void testThatDiariesCanAddMoreThan(){
        assertEquals(0, diaries.getNumbersOfDiaries());
        diaries.add("username", "password");
        diaries.add("username2", "password2");
        diaries.add("username3", "password3");
        assertEquals(3, diaries.getNumbersOfDiaries());
    }

    @Test
    public void testThatDiariesCanFindDiaryByUsername() throws InvalidUsernameException {
        assertEquals(0, diaries.getNumbersOfDiaries());
        diaries.add("username", "password");
        diaries.add("username2", "password2");
        assertEquals(2, diaries.getNumbersOfDiaries());
        assertNotNull(diaries.find("username2"));
    }

    @Test
    public void testThatDiariesThrowExceptionUsernameDoesNotExist() throws InvalidUsernameException {
        assertEquals(0, diaries.getNumbersOfDiaries());
        diaries.add("username", "password");
        diaries.add("username2", "password2");
        assertEquals(2, diaries.getNumbersOfDiaries());
        assertThrows(InvalidUsernameException.class, ()->diaries.find("username4"));
    }

    @Test
    public void testThatDiariesCanDeleteDiary() throws InvalidUsernameException {
        assertEquals(0, diaries.getNumbersOfDiaries());
        diaries.add("username", "password");
        diaries.add("username2", "password2");
        assertEquals(2, diaries.getNumbersOfDiaries());
        diaries.delete("username2", "password2");
        assertEquals(1, diaries.getNumbersOfDiaries());
        assertThrows(InvalidUsernameException.class, ()->diaries.find("username2"));
    }

    @Test
    public void testThatDiariesCannotDeleteDiaryWithWrongPassword() throws InvalidUsernameException {
        assertEquals(0, diaries.getNumbersOfDiaries());
        diaries.add("username", "password");
        diaries.add("username2", "password2");
        assertEquals(2, diaries.getNumbersOfDiaries());
        assertThrows(InvalidPasswordException.class, ()->diaries.delete("username2", "wrongPassword"));
        assertEquals(2, diaries.getNumbersOfDiaries());
    }
}
