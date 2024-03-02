package myDiary;

import java.time.LocalDate;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDate dateCreated;

    public Entry(int id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getId(){
        return this.id;
    }

    public String getTitle(){
        return this.title;
    }

    public void setBody(String body){
        this.body = body;
    }
    public String getBody() {
        return this.body;
    }

    @Override
    public String toString(){
        return String.format("Id: %s\nTitle: %s\nBody: %s\n", getId(), getTitle(), getBody());
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }
}
