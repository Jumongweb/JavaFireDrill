package estore;

import java.util.ArrayList;
import java.util.List;

public class Seller extends User{
    private List<Item> sellerItems;
    public Seller(int age, String emailAddress, String homeAddress, String name, String password, String phone){
        super(age, emailAddress, homeAddress, name, password, phone);
        sellerItems = new ArrayList<>();
    }

    public void add(Item item) {
        sellerItems.add(item);
    }

    public int getNumberOfSellerItems(){
        return sellerItems.size();
    }
}
