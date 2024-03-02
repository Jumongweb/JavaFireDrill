package bankApp;

import bankApp.exceptions.InvalidAccountException;
import bankApp.exceptions.InvalidPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    private Bank bank;

    @BeforeEach
    public void setUp(){
        bank = new Bank("Mavericks");
    }

    @Test
    public void testThatMyBankCanAdd1Customer(){
        Bank bank = new Bank("Mavericks");
        bank.registerCustomer("Lawal", "Toheeb", "1234");
        assertEquals(1, bank.getNumberOfAccounts());
    }

    @Test
    public void testThatMyBankCanAddMoreThanOneCustomer(){
        assertEquals(0, bank.getNumberOfAccounts());

        bank.registerCustomer("Lawal", "Toheeb", "1234");
        bank.registerCustomer("General", "Jumong", "5678");
        assertEquals(2, bank.getNumberOfAccounts());
    }

    @Test
    public void testThatMyBankCanFindAccount(){
        assertEquals(0, bank.getNumberOfAccounts());
        Account actual = bank.registerCustomer("General", "Jumong", "5678");
        assertEquals(1, bank.getNumberOfAccounts());
        assertEquals(actual, bank.findAcccount(10001));
    }

    @Test
    public void testThatMyBankThrowExceptionIfCustomerDoesNotExist(){
        assertEquals(0, bank.getNumberOfAccounts());

        bank.registerCustomer("General", "Jumong", "5678");
        assertThrows(InvalidAccountException.class, ()->bank.findAcccount(10002));
    }

    @Test
    public void testThatMyBankCanDepositMoneyIntoAnAccount(){
        assertEquals(0, bank.getNumberOfAccounts());
        bank.registerCustomer("Lawal", "Toheeb", "1234");
        bank.deposit(10001, 2_000);
        System.out.println(bank.getAccounts());
        assertEquals(2000, bank.checkBalance(10001, "1234"));
    }

    @Test
    public void testThatMyBankCanDepositIntoAnAccountTwice(){
        assertEquals(0, bank.getNumberOfAccounts());
        bank.registerCustomer("Lawal", "Toheeb", "1234");
        bank.deposit(10001, 4_000);
        bank.deposit(10001, 3_000);
        System.out.println(bank.getAccounts());
        assertEquals(7_000, bank.checkBalance(10001, "1234"));
    }


    @Test
    public void testThatMyBankCanDepositMoneyIntoMoreThanOneAccount(){
        assertEquals(0, bank.getNumberOfAccounts());
        bank.registerCustomer("Lawal", "Toheeb", "1234");
        bank.registerCustomer("General", "Jumong", "1234");
        bank.deposit(10001, 5_000);
        bank.deposit(10002, 3_000);
        System.out.println(bank.getAccounts());
        assertEquals(5000, bank.checkBalance(10001, "1234"));
        assertEquals(3_000, bank.checkBalance(10002, "1234"));
    }

    @Test
    public void testThatMyBankCanTransferIntoAnotherAccount(){
        assertEquals(0, bank.getNumberOfAccounts());
        bank.registerCustomer("Lawal", "Toheeb", "1234");
        bank.registerCustomer("General", "Jumong", "9876");
        bank.deposit(10001, 5_000);
        bank.deposit(10002, 3_000);
        assertEquals(5000, bank.checkBalance(10001, "1234"));
        assertEquals(3_000, bank.checkBalance(10002, "9876"));
        bank.transfer(10001, 10002, 2_000, "1234");
        assertEquals(3000, bank.checkBalance(10001, "1234"));
        assertEquals(5_000, bank.checkBalance(10002, "9876"));
    }

    @Test
    public void testTransferWithWrongPinBalanceRemainTheSame(){
        assertEquals(0, bank.getNumberOfAccounts());
        bank.registerCustomer("Lawal", "Toheeb", "1234");
        bank.registerCustomer("General", "Jumong", "9876");
        bank.deposit(10001, 5_000);
        bank.deposit(10002, 3_000);
        assertEquals(5000, bank.checkBalance(10001, "1234"));
        assertEquals(3_000, bank.checkBalance(10002, "9876"));
        assertThrows(InvalidPinException.class, ()->bank.transfer(10001, 10002, 2_000, "4321"));
        assertEquals(5000, bank.checkBalance(10001, "1234"));
        assertEquals(3_000, bank.checkBalance(10002, "9876"));
    }

    @Test
    public void testThatMyBankCanWithdraw(){
        assertEquals(0, bank.getNumberOfAccounts());
        bank.registerCustomer("Lawal", "Toheeb", "1234");
        bank.registerCustomer("General", "Jumong", "9876");
        bank.deposit(10001, 5_000);
        assertEquals(5000, bank.checkBalance(10001, "1234"));
        bank.withdraw(10001, 1000, "1234");
        assertEquals(4000, bank.checkBalance(10001, "1234"));
    }

    @Test
    public void testThatMyBankCanRemoveAccount(){
        assertEquals(0, bank.getNumberOfAccounts());
        bank.registerCustomer("Lawal", "Toheeb", "1234");
        bank.registerCustomer("General", "Jumong", "9876");
        assertEquals(2, bank.getNumberOfAccounts());
        bank.remove(10001);
        assertEquals(1, bank.getNumberOfAccounts());
    }
}
