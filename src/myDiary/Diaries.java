package myDiary;

import myDiary.exceptions.InvalidUsernameException;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List<Diary> diaries = new ArrayList<>();


    private int noOfDiaries;

    public int getNumbersOfDiaries(){
        return noOfDiaries;
    }

    public void add(String username, String password) {
        Diary diary = new Diary(username, password);
        diaries.add(diary);
        noOfDiaries++;
    }

    public Diary find(String username) throws InvalidUsernameException {
        Diary searchDiary = null;
        for (Diary diary : diaries){
            if (diary.getUsername().equals(username)){
                searchDiary = diary;
            }
        }
        if (searchDiary == null) throw new InvalidUsernameException("Username does not exist");
        return searchDiary;
    }

    public void delete(String username, String password) throws InvalidUsernameException {
        Diary diary = find(username);
        diary.validate(password);
        diaries.remove(diary);
        noOfDiaries--;
    }
}
