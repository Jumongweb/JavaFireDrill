package estore;

public class Customer extends User{
    private ShoppingCart shoppingCart;
    public Customer(int age, String emailAddress, String homeAddress, String name, String password, String phone) {
        super(age, emailAddress, homeAddress, name, password, phone);
        shoppingCart = new ShoppingCart();
    }


}
