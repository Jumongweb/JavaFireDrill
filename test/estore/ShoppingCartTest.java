package estore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingCartTest {

    @Test
    public void testThatIHaveAShoppingCartAndItIsEmpty(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.numberOfItems());
    }

    @Test
    public void testThatItemsCanBeAddedToMyCart(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.numberOfItems());
        Product product1 = new Product(1, "Knife", 2000, "Used for cutting vegetables", ProductCategory.UTENSILS);
        Item item1 = new Item(2, product1);
        shoppingCart.add(item1);
        assertEquals(1, shoppingCart.numberOfItems());
    }

    @Test
    public void testAddThreeItemsToMyCartTheNumberOfItemsIsThree(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.numberOfItems());
        Product product1 = new Product(1, "Knife", 2000, "Used for cutting vegetables", ProductCategory.UTENSILS);
        Product product2 = new Product(2, "Palm Oil", 2000, "Used for cutting vegetables", ProductCategory.GROCERIES);
        Product product3 = new Product(3, "Jean", 2000, "Used for cutting vegetables", ProductCategory.CLOTHING);
        Item item1 = new Item(2, product1);
        Item item2 = new Item(1, product2);
        Item item3 = new Item(4, product3);

        shoppingCart.add(item1);
        shoppingCart.add(item2);
        shoppingCart.add(item3);
        assertEquals(3, shoppingCart.numberOfItems());
    }

    @Test
    public void testThatMyCartCanFindItem(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.numberOfItems());
        Product product1 = new Product(1, "Knife", 2000, "Hades kitchen knife", ProductCategory.UTENSILS);
        Item item1 = new Item(4, product1);

        shoppingCart.add(item1);
        assertEquals(1, shoppingCart.numberOfItems());

        assertEquals(item1, shoppingCart.find(item1));
    }

    @Test
    public void testThatMyCartCanFindItemAndGetTheQuantityOfTheParticularItem(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.numberOfItems());
        Product product3 = new Product(3, "Jeans", 2000, "Jeans for men", ProductCategory.CLOTHING);
        Item item1 = new Item(4, product3);
        shoppingCart.add(item1);
        assertEquals(1, shoppingCart.numberOfItems());

        Item foundItem = shoppingCart.find(item1);
        assertEquals(4, foundItem.getQuantityOfProduct());
    }

    @Test
    public void testThatMyCartCanFindAndReturnTheProductType(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.numberOfItems());
        Product product1 = new Product(1, "Knife", 2000, "Hades kitchen knife", ProductCategory.UTENSILS);
        Item item1 = new Item(2, product1);
        shoppingCart.add(item1);
        assertEquals(1, shoppingCart.numberOfItems());
        Item foundItem = shoppingCart.find(item1);
        assertEquals(product1, foundItem.getProduct());
    }

    @Test
    public void testThatMyCartCanFindAndReturnTheProductCategory(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.numberOfItems());
        Product product1 = new Product(1, "Knife", 2000, "Used for cutting vegetables", ProductCategory.UTENSILS);
        Item item1 = new Item(4, product1);
        shoppingCart.add(item1);
        assertEquals(1, shoppingCart.numberOfItems());
        Item foundItem = shoppingCart.find(item1);
        assertEquals(ProductCategory.UTENSILS, foundItem.getProduct().getCategory());
    }

    @Test
    public void testThatMyCartCanFindItemAndReturnThePrice(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.numberOfItems());
        Product product1 = new Product(1, "Knife", 1500, "Used for cutting vegetables", ProductCategory.UTENSILS);
        Product product2 = new Product(2, "Palm Oil", 5000, "Golden penny soya oil", ProductCategory.GROCERIES);
        Product product3 = new Product(3, "Jean", 2000, "Stock jeans for men", ProductCategory.CLOTHING);
        Item item1 = new Item(2, product1);
        Item item2 = new Item(1, product2);
        Item item3 = new Item(4, product3);
        shoppingCart.add(item1);
        shoppingCart.add(item2);
        shoppingCart.add(item3);
        assertEquals(3, shoppingCart.numberOfItems());
        Item foundItem = shoppingCart.find(item3);
        System.out.println(foundItem);
        assertEquals(2000, foundItem.getProduct().getPrice());
    }

    @Test
    public void testThatMyCartCanRemoveItem(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.numberOfItems());
        Product product1 = new Product(1, "Knife", 1500, "Used for cutting vegetables", ProductCategory.UTENSILS);
        Product product2 = new Product(2, "Palm Oil", 5000, "Golden penny soya oil", ProductCategory.GROCERIES);
        Product product3 = new Product(3, "Jean", 2000, "Stock jeans for men", ProductCategory.CLOTHING);
        Item item1 = new Item(2, product1);
        Item item2 = new Item(1, product2);
        Item item3 = new Item(4, product3);
        shoppingCart.add(item1);
        shoppingCart.add(item2);
        shoppingCart.add(item3);
        assertEquals(3, shoppingCart.numberOfItems());
        Item foundItem = shoppingCart.find(item3);
        System.out.println(foundItem);
        assertEquals(2000, foundItem.getProduct().getPrice());
    }




    /* @Test
    public void testThatMyCartThrowExceptionIfItCannotbeFound(){
        ShoppingCart shoppingCart = new ShoppingCart();
        assertEquals(0, shoppingCart.numberOfItems());
        Product product1 = new Product(1, "Knife", 2000, "Hades kitchen knife", ProductCategory.UTENSILS);
        Product product2 = new Product(2, "Palm Oil", 6000, "Golden penny soya oil", ProductCategory.GROCERIES);
        Product product3 = new Product(3, "Jeans", 2000, "Jeans for men", ProductCategory.CLOTHING);
        Item item1 = new Item(2, product1);
        Item item2 = new Item(1, product2);
        Item item3 = new Item(4, product3);

        shoppingCart.add(item1);
        shoppingCart.add(item2);
        shoppingCart.add(item3);
        assertEquals(3, shoppingCart.numberOfItems());
    } */


}
