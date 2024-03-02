package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void depositNegativeBalance_balanceRemainsUnchangedTest(){
        Account myAccount = new Account();
        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(-50000);
        assertEquals(0,myAccount.getBalance());
    }

    @Test
    public void depositPositiveAmount_balanceIncreasesTest(){
        Account myAccount = new Account();
        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(2_000);
        assertEquals(2_000, myAccount.getBalance());
    }

    @Test
    public void depositPositiveAmountTwice_balanceIncreasesTest(){
        Account myAccount = new Account();
        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(2_000);
        myAccount.deposit(4_000);

        assertEquals(6000, myAccount.getBalance());
    }

    @Test
    public void withdrawPositiveAmountWillReduceTheBalance(){
        Account myAccount = new Account();
        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(5_000);
        myAccount.withdraw(2_000);
        myAccount.withdraw(1_000);
        assertEquals(2000, myAccount.getBalance());
    }

    @Test
    public void withdrawNegativeValueWillLeaveTheBalanceUnchange(){
        Account myAccount = new Account();
        assertEquals(0, myAccount.getBalance());

        myAccount.deposit(5_000);
        myAccount.deposit(-2_000);
        myAccount.deposit(1_000);
        assertEquals(6_000, myAccount.getBalance());
    }
}
