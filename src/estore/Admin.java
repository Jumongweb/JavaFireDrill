package estore;

import java.util.ArrayList;
import java.util.List;

public class Admin extends User{
    private List<Item> items;
    public Admin(int age, String emailAddress, String homeAddress, String name, String password, String phone) {
        super(age, emailAddress, homeAddress, name, password, phone);
        items = new ArrayList<>();
    }
}
