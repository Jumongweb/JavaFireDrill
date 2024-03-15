package estore;

import java.util.ArrayList;
import java.util.List;

public class Estore {

    private List<Admin> admins;
    private List<Seller> sellers;
    private List<Customer> customers;
    private List<Product> Product;

    private boolean isApproved = true;
    public Estore(){
        admins = new ArrayList<>();
        sellers = new ArrayList<>();
        customers = new ArrayList<>();
        Product = new ArrayList<>();
    }

    public Admin createAdmin(int age, String email, String homeAddress, String name, String password, String phone){
        Admin admin = new Admin(age, email, homeAddress, name, password, phone);
        admins.add(admin);
        return admin;
    }

    public int getNumberOfSeller() {
        return sellers.size();
    }


    public boolean isApproved(User user){
        if (user.getAge() < 15 || user.getEmailAddress() == null || user.getHomeAddress() == null || user.getName() == null || user.getPassword() == null || user.getPhone() == null)
            isApproved = false;
        return isApproved;
    }

    public int getNumberOfAdmin() {
        return admins.size();
    }

    public Seller add(Seller seller) {
        sellers.add(seller);
        return seller;
    }
    public Customer add(Customer customer) {
        customers.add(customer);
        return customer;
    }

    public int getNumberOfCustomer() {
        return customers.size();
    }
}
