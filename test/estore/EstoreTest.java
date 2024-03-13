package estore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstoreTest {

    private static Estore estore;

    @BeforeEach
    public void initializeStore(){
        estore = new Estore();
    }

    @Test
    public void testThatIHaveAE_StoreWithNoAdmin(){
        assertEquals(0, estore.getNumberOfAdmin());
    }

    @Test
    public void testThatIHaveAE_StoreWithNoAdmin_AddAdmin(){
        assertEquals(0, estore.getNumberOfAdmin());
        estore.createAdmin(
                24, "lawal@semicolon.com",
                "No 6, Genius street, Toronto, Canada","Jumong",
                "password","08193849844"
        );
        assertEquals(1, estore.getNumberOfAdmin());
    }

    @Test
    public void testThatEstoreCanHaveMultipleAdmin(){
        assertEquals(0, estore.getNumberOfAdmin());
        estore.createAdmin(
                19, "toheeb@semicolon.com",
                "No 4, Billionaire street, Lekki, Nigeria","toheeb",
                "password","08116849844"
        );
        estore.createAdmin(
                24, "lawal@semicolon.com",
                "No 6, Genius street, Toronto, Canada","Jumong",
                "password","08193849844"
        );
        estore.createAdmin(
                24, "banji@semicolon.com",
                "No 9, Paradise street, London","Banji",
                "password","08132435323"
        );
        assertEquals(3, estore.getNumberOfAdmin());
    }

    @Test
    public void testThatIHaveAE_StoreWithNoUser(){
        assertEquals(0, estore.getNumberOfUser());
    }

    @Test
    public void testThatE_StoreCanAddSellerWithAdminApproval(){
        Seller seller1 = new Seller(
                20, "jumong@semicolon.com","No 6, Paradise street, Sans Fransico, America",
                "Jumong", "password","08193849844"
                );
        estore.add(seller1);
        assertEquals(1, estore.getNumberOfUser());
    }

    @Test
    public void testThatE_StoreThrowsExceptionIfUserIsAddedWithoutAdminApproval(){
        assertEquals(0, estore.getNumberOfUser());
        Seller seller1 = new Seller(
                12, "jumong@semicolon.com","No 6, Paradise street, Sans Fransico, America",
                "Jumong", "password","08193849844"
        );
        assertThrows(NotApproveUserException.class, ()->estore.add(seller1));

        assertEquals(0, estore.getNumberOfUser());
    }

    @Test
    public void testThatMyE_StoreAndCanAddMoreThanOneSeller(){
        assertEquals(0, estore.getNumberOfUser());
        Seller seller1 = new Seller(
                20, "jumong@semicolon.com",
                "No 6, Paradise street, Sans Fransico, America","Jumong",
                "password","08193849844"
        );
        Seller seller2 = new Seller(
                22, "toheeb@semicolon.com",
                "No 6, Billionaire street, London, United Kingdom","Toheeb",
                "password","09031848044"
        );
        Seller seller3 = new Seller(
                24, "lawal@semicolon.com",
                "No 6, Genius street, Toronto, Canada","Jumong",
                "password","08193849844"
        );
        estore.add(seller1);
        estore.add(seller2);
        estore.add(seller3);
        assertEquals(3, estore.getNumberOfUser());
    }

    @Test
    public void testthatE_StoreCanHaveDifferentTypesOfUser(){
        assertEquals(0, estore.getNumberOfUser());
        Seller seller1 = new Seller(
                20, "jumong@semicolon.com","No 6, Paradise street," +
                "Sans Fransico, America","Jumong", "password","08193849844"
            );

        Customer customer1 = new Customer(
                24, "lawal@semicolon.com",
                "No 6, Genius street, Toronto, Canada","Jumong",
                "password","08193849844"
        );

        estore.add(seller1);
        estore.add(customer1);
        assertEquals(2, estore.getNumberOfUser());
    }

    @Test
    public void testthatE_StoreCanAddItemToTheirList(){
        assertEquals(0, estore.getNumberOfUser());
        Seller seller1 = new Seller(
                20, "jumong@semicolon.com","No 6, Paradise street," +
                "Sans Fransico, America","Jumong", "password","08193849844"
        );
        assertEquals(0, seller1.getNumberOfSellerItems());
        Product product1 = new Product(1, "Airconditioner", 55000.50, "R-410 Gas", ProductCategory.ELECTRONICS);
        Item item1 = new Item(4, product1);
        seller1.add(item1);
        assertEquals(1, seller1.getNumberOfSellerItems());

        Customer customer1 = new Customer(
                24, "lawal@semicolon.com",
                "No 6, Genius street, Toronto, Canada","Jumong",
                "password","08193849844"
        );

        estore.add(seller1);
        estore.add(customer1);
        assertEquals(2, estore.getNumberOfUser());
    }


    /*@Test
    public void testThatIHaveAStoreAndThereIsNoItemInTheStore(){
        assertEquals(0, estore.getNumberOfItems());
    }

    @Test
    public void testThatSellerCanAddItemToTheStore(){
        Product product1 = new Product(1, "Knife", 2000, "Used for cutting vegetables", ProductCategory.UTENSILS);
        Product product2 = new Product(2, "Palm Oil", 2000, "Used for cutting vegetables", ProductCategory.GROCERIES);
        Product product3 = new Product(3, "Jean", 2000, "Used for cutting vegetables", ProductCategory.CLOTHING);
        Item item1 = new Item(2, product1);
        Item item2 = new Item(1, product2);
        Item item3 = new Item(4, product3);
        Seller seller1 = new Seller(20, "James@semicolon.com", "No 4, Ebinpejo lane, Lagos", "James", "password", "09057534323");
        seller1.add(item1);
        assertEquals(1, estore.getNumberOfItems());
    } */
}
