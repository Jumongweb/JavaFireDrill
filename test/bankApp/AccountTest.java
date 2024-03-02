package bankApp;

import bankApp.exceptions.InsufficientFundsException;
import bankApp.exceptions.InvalidAmountException;
import bankApp.exceptions.InvalidPinException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    @Test
    public void testThatAccountIsZero() throws InvalidPinException {
        bankApp.Account myAccount = new bankApp.Account("Chibuzor", 0, "1234", 001);
        assertEquals(0, myAccount.checkBalance("1234"));

    }

    @Test
    public void depositNegativeBalance_balanceRemainsUnchangedTest() throws InvalidPinException, InvalidAmountException {
        bankApp.Account myAccount = new bankApp.Account("Chibuzor", 0, "1234", 001);
        assertEquals(0, myAccount.checkBalance("1234"));

        assertThrows(InvalidAmountException.class, ()->myAccount.deposit(-50000));
        assertEquals(0,myAccount.checkBalance("1234"));
    }

    @Test
    public void depositPositiveAmount_balanceIncreasesTest() throws InvalidPinException, InvalidAmountException {
        bankApp.Account myAccount = new bankApp.Account("Chibuzor", 0, "1234", 001);
        assertEquals(0, myAccount.checkBalance("1234"));

        myAccount.deposit(2_000);
        assertEquals(2_000, myAccount.checkBalance("1234"));
    }

    @Test
    public void depositPositiveAmountTwice_balanceIncreasesTest() throws InvalidPinException, InvalidAmountException {
        bankApp.Account myAccount = new bankApp.Account("Chibuzor", 0, "1234", 001);
        assertEquals(0, myAccount.checkBalance("1234"));

        myAccount.deposit(2_000);
        myAccount.deposit(4_000);

        assertEquals(6000, myAccount.checkBalance("1234"));
    }

    @Test
    public void withdrawPositiveAmountWillReduceTheBalance() throws InvalidPinException, InvalidAmountException, InsufficientFundsException {
        bankApp.Account myAccount = new bankApp.Account("Chibuzor", 0, "1234", 001);
        assertEquals(0, myAccount.checkBalance("1234"));

        myAccount.deposit(5_000);
        myAccount.withdraw(2_000, "1234");
        myAccount.withdraw(1_000, "1234");
        assertEquals(2000, myAccount.checkBalance("1234"));
    }

    @Test
    public void testThatMYAccountThrowsInvalidExceptionIfUserTryDepositInvalidAmount() throws InvalidPinException, InvalidAmountException {
        bankApp.Account myAccount = new bankApp.Account("Chibuzor", 0, "1234", 001);
        myAccount.deposit(20_000);
        assertEquals(20_000, myAccount.checkBalance("1234"));
       assertThrows(InvalidAmountException.class, ()->myAccount.deposit(-1000));

    }

    @Test
    public void withdrawNegativeValueWillLeaveTheBalanceUnchange() throws InvalidPinException, InvalidAmountException {
        bankApp.Account myAccount = new bankApp.Account("Chibuzor", 0, "1234", 001);
        assertEquals(0, myAccount.checkBalance("1234"));

        myAccount.deposit(5_000);
        assertThrows(InvalidAmountException.class, ()->myAccount.deposit(-2_000));
        myAccount.deposit(1_000);
        assertEquals(6_000, myAccount.checkBalance("1234"));
    }

    @Test
    public void testThatIcanCheckMyBalanceIfMyPinIsCorrect() throws InvalidPinException, InvalidAmountException {
        bankApp.Account myAccount = new bankApp.Account("Chibuzor", 0, "123456", 001);
        myAccount.deposit(2_000);
        assertEquals(2_000, myAccount.checkBalance("123456"));
    }

    @Test
    public void testThatMyAccountThrowsAnExceptionIfInvalidPinIsEnter() throws InvalidAmountException {
        bankApp.Account myAccount = new bankApp.Account("Chibuzor", 0, "123456", 100);
        myAccount.deposit(2_000);
        assertThrows(InvalidPinException.class, ()->myAccount.checkBalance("54321"));
    }

    @Test
    public void testThatMYAccountThrowsInsufficientFundsExceptionIfUserTryToWithdrawAmountGreaterThanBalance() throws InvalidPinException, InvalidAmountException, InsufficientFundsException {
        bankApp.Account myAccount = new bankApp.Account("Chibuzor", 0, "1234", 001);
        myAccount.deposit(2_000);
        assertEquals(2_000, myAccount.checkBalance("1234"));
        assertThrows(InsufficientFundsException.class, ()->myAccount.withdraw(3000, "1234"));

    }

    @Test
    public void testThatMyAccountCannotDepositZero() throws InvalidAmountException, InvalidPinException {
        bankApp.Account myAccount = new bankApp.Account("Chibuzor", 0, "1234", 001);
        assertThrows(InvalidAmountException.class, ()->myAccount.deposit(0));
    }

    @Test
    public void testThatMyAccountCannotWithdrawZero() throws InvalidAmountException, InvalidPinException {
        bankApp.Account myAccount = new bankApp.Account("Chibuzor", 0, "1234", 001);
        myAccount.deposit(1000);
        assertEquals(1_000, myAccount.checkBalance("1234"));
        assertThrows(InvalidAmountException.class, ()->myAccount.withdraw(0, "1234"));
    }
}
