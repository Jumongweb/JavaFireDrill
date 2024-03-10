package estore;

import java.util.ArrayList;
import java.util.List;

public class Estore {

    private List<Admin> admins;
    private List<User> users;

    private boolean isApproved = true;
    public Estore(){
        users = new ArrayList<>();
        admins = new ArrayList<>();
    }

    public Admin createAdmin(int age, String email, String homeAddress, String name, String password, String phone){
        Admin admin = new Admin(age, email, homeAddress, name, password, phone);
        admins.add(admin);
        return admin;
    }

    public int getNumberOfUser() {
        return users.size();
    }

    public void add(User user) {
        if (!(isApproved(user))) throw new NotApproveUserException("User not approved");
        users.add(user);
    }


    public boolean isApproved(User user){
        if (user.getAge() < 15 || user.getEmailAddress() == null || user.getHomeAddress() == null || user.getName() == null || user.getPassword() == null || user.getPhone() == null)
            isApproved = false;
        return isApproved;
    }

    public int getNumberOfAdmin() {
        return admins.size();
    }
}
