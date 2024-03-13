package myDiary;

import myDiary.exceptions.DiaryLockedException;
import myDiary.exceptions.InvalidPasswordException;
import myDiary.exceptions.InvalidEntryException;

import java.util.ArrayList;
import java.util.List;
public class Diary {
    private String username;
    private String password;
    private boolean isLocked = true;
    private int noOfEntries;
    private final List<Entry> entries = new ArrayList<>();

    public Diary(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void createEntry(String title, String body) throws InvalidPasswordException {
        if (isLocked()) throw new InvalidPasswordException("Enter password");
        noOfEntries++;
        Entry entry = new Entry(noOfEntries, title, body);
        entries.add(entry);
        //System.out.println(entry.getDateCreated());
    }

    public int generateId(){
        return noOfEntries;
    }

    public int getNoOfEntries() {
        if (isLocked()) throw new InvalidPasswordException("Enter pin");
        return entries.size();
    }

    public void unlockDiary(String password) {
        if (!(this.password.equals(password))) throw new InvalidPasswordException("Invalid password");
        this.isLocked = false;

    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lock() {
        isLocked = true;
    }

    public Entry findEntryBy(int id) throws InvalidEntryException {
        Entry searchEntry = null;
        if (isLocked()) throw new InvalidPasswordException("Enter password");
        for (Entry entry : entries){
            if (entry.getId() == id){ searchEntry = entry; }
        }
        if (searchEntry == null) throw new InvalidEntryException("Entry does not exist");
        return searchEntry;
    }

    public void delete(int id) {
        Entry entry = findEntryBy(id);
        entries.remove(entry);
    }

    public void update(int id, String body, String password) throws DiaryLockedException {
        if (isLocked()) throw new DiaryLockedException("Enter password");
        validate(password);
        Entry entry = findEntryBy(id);
        String updateBody =  entry.getBody() + body;
        entry.setBody(updateBody);
    }

    public void validate(String password) {
        if (!(this.password.equals(password))) throw new InvalidPasswordException("Incorrect password");
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }

}
