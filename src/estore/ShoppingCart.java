package estore;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Item> cart;
    //= new ArrayList<>();

    private Item item;

    public ShoppingCart(){
        cart = new ArrayList<>();
    }
    public int numberOfItems(){
        return cart.size();
    }

    public void add(Item item) {
        cart.add(item);
    }

    public Item find(Item item) {
        Item searchItem = null;
        for (Item cartItem : cart){
            if (item == cartItem) searchItem = cartItem;
        }
        if (searchItem == null) throw new ItemNotFoundException("Item not in the cart");
        return searchItem;
    }
}
