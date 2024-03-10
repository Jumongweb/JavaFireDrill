package estore;

import org.junit.jupiter.api.Test;

public class ItemsTest {
    @Test
    public void testsomething(){
        //ProductCategory airconditioner = ProductCategory.ELECTRONICS;
        Product product1 = new Product(1, "AirConditioner", 5500.50, "High quality R4-10 airconditioner", ProductCategory.ELECTRONICS);
        Item items = new Item(2, product1);
        System.out.println(items.getProduct().getDescription());
        System.out.println(items.getQuantityOfProduct());
        System.out.println(items.getProduct().getCategory());
        //System.out.println(items);
    }
}
