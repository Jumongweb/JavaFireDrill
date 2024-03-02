package myDiary;

import myDiary.exceptions.DiaryLockedException;
import myDiary.exceptions.InvalidPasswordException;
import myDiary.exceptions.InvalidEntryException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    @Test
    public void testThatIHaveDiaryAndItIsLocked(){
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatIHaveDiaryAndItIsLocked_IUnlockIt(){
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
    }

    @Test
    public void testThatWrongPasswordCannotUnlockMyDiary(){
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        assertThrows(InvalidPasswordException.class, ()->diary.unlockDiary("wrongPassword"));
        assertTrue(diary.isLocked());
    }

    @Test
    public void testThatICanCreateAnEntryInMyDiary(){
        Diary diary = new Diary("Jumong", "password");
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        diary.createEntry("Jumong", "password");
        assertEquals(1, diary.getNoOfEntries());
    }

    @Test
    public void testThatIhaveThreeEntryInMyDiary(){
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        diary.createEntry("Love", "There is no mountain i won't climb or river i won't swim to make you mine");
        diary.createEntry("Semicolon", "You people want to kill us");
        diary.createEntry("Goal", "My goal is to become a BILLIONAIRE this year");
        assertEquals(3, diary.getNoOfEntries());
    }

    @Test
    public void testThatICannotCreateEntryIfMyDiaryIsLocked(){
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        assertThrows(InvalidPasswordException.class, ()->diary.createEntry("Love", "There is no mountain i won't climb or river i won't swim to make you mine"));
    }

    @Test
    public void testThatICanLockMyDiary(){
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        diary.createEntry("Semicolon", "You people want to kill us");
        diary.createEntry("Goal", "My goal is to become a BILLIONAIRE this year");
        assertEquals(2, diary.getNoOfEntries());
        diary.lock();
        assertThrows(InvalidPasswordException.class, ()->diary.createEntry("Love", "There is no mountain i won't climb or river i won't swim to make you mine"));
    }

    @Test
    public void testThatDiaryCanFindEntryById() throws InvalidEntryException {
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        diary.createEntry("Semicolon", "You people want to kill us");
        diary.createEntry("Goal", "My goal is to become a BILLIONAIRE this year");
        assertEquals(2, diary.getNoOfEntries());
        //Entry actual = new Entry(1, "Semicolon", "You people want to kill us");
        assertNotNull(diary.findEntryBy(1));
        //Entry actual2 = new Entry(1, "Semicolon", "You people want to kill us");
        //assertEquals(actual, actual2);

    }

    @Test
    public void testThatDiaryCannotFindEntryIfDiaryIsLocked(){
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        diary.createEntry("Semicolon", "You people want to kill us");
        diary.createEntry("Goal", "My goal is to become a BILLIONAIRE this year");
        assertEquals(2, diary.getNoOfEntries());
        diary.lock();
        assertThrows(InvalidPasswordException.class, ()->diary.findEntryBy(1));
    }

    @Test
    public void testThatDiaryThrowExceptionIfAnEntryThatDoesNotExistIsSearchedFor() throws InvalidEntryException {
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        diary.createEntry("Semicolon", "You people want to kill us");
        diary.createEntry("Goal", "My goal is to become a BILLIONAIRE this year");
        assertEquals(2, diary.getNoOfEntries());
        assertThrows(InvalidEntryException.class, ()->diary.findEntryBy(3));
    }

    @Test
    public void testThatMyDiaryCanDeleteAnEntry(){
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        assertEquals(0, diary.getNoOfEntries());
        diary.createEntry("Semicolon", "You people want to kill us");
        diary.createEntry("Goal", "My goal is to become a BILLIONAIRE this year");
        assertEquals(2, diary.getNoOfEntries());
        diary.delete(2);
        assertThrows(InvalidEntryException.class, ()->diary.findEntryBy(2));
    }

    @Test
    public void testThatMyDiaryCannotDeleteAnEntryThatDoesNotExist(){
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        assertEquals(0, diary.getNoOfEntries());
        diary.createEntry("Semicolon", "You people want to kill us");
        diary.createEntry("Goal", "My goal is to become a BILLIONAIRE this year");
        assertEquals(2, diary.getNoOfEntries());
        assertThrows(InvalidEntryException.class, ()->diary.delete(5));
    }

    @Test
    public void testThatMyDiaryCanUpdateAnEntry() throws DiaryLockedException {
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        assertEquals(0, diary.getNoOfEntries());
        diary.createEntry("Semicolon", "You people want to kill us");
        diary.createEntry("Goal", "My goal is to become a BILLIONAIRE this year");
        assertEquals(2, diary.getNoOfEntries());
        diary.update(2, "Also, i will be an expert in my field as a software engineer", "password");
        System.out.println(diary.findEntryBy(2));
    }

    @Test
    public void testThatMyDiaryCannotUpdateWhenLocked(){
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        assertEquals(0, diary.getNoOfEntries());
        diary.createEntry("Semicolon", "You people want to kill us");
        diary.createEntry("Goal", "My goal is to become a BILLIONAIRE this year");
        assertEquals(2, diary.getNoOfEntries());
        diary.lock();
        assertThrows(DiaryLockedException.class, ()->diary.update(2, "Also, i will be an expert in my field as a software engineer", "password"));
    }

    @Test
    public void testThatMyDiaryCannotbeUpdatedWithWrongPassword() throws DiaryLockedException {
        Diary diary = new Diary("Jumong", "password");
        assertTrue(diary.isLocked());
        diary.unlockDiary("password");
        assertFalse(diary.isLocked());
        assertEquals(0, diary.getNoOfEntries());
        diary.createEntry("Semicolon", "You people want to kill us");
        diary.createEntry("Goal", "My goal is to become a BILLIONAIRE this year");
        assertEquals(2, diary.getNoOfEntries());
        assertThrows(InvalidPasswordException.class, ()->diary.update(2, "Also, i will be an expert in my field as a software engineer", "wrongPassword"));
        System.out.println(diary.findEntryBy(2));
    }
}
