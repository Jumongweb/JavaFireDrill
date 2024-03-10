package estore;

import java.util.ArrayList;
import java.util.List;

public class Estore {
    private List<User> users;

    public Estore(){
        users = new ArrayList<>();
    }

    public int getNumberOfUser() {
        return users.size();
    }

    public void add(User user) {
        users.add(user);
    }

}
