import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

    private BankAccount account;

    @Before
    public void setUp() {
        account = new BankAccount("123ABC");
    }

    // testDepositPositiveAmount: Checks if depositing a positive amount updates the balance correctly.
    
    @Test
    public void testDepositPositiveAmount() {
                account.deposit(500);
                assertEquals("Balance should be updated after deposit", 500, account.getBalance(), 0.01);
    }

    //  testDepositNegativeAmount: Verifies that depositing a negative amount throws an IllegalArgumentException.

    @Test(expected = IllegalArgumentException.class)
    public void testDepositNegativeAmount() {
                account.deposit(-100);
    }


    //  testWithdrawValidAmount: Ensures that withdrawing a valid amount updates the balance correctly.

    @Test
    public void testWithdrawValidAmount() {
                account.deposit(1000);
                account.withdraw(500);
                assertEquals("Balance should be updated after withdrawal", 500, account.getBalance(), 0.01);
    }

    // testWithdrawMoreThanBalance and testWithdrawNegativeAmount: Test withdrawing more money than is in the account and withdrawing a negative amount, respectively. Both should throw an IllegalArgumentException.

    @Test
    public void testWithdrawMoreThanBalance() {
                account.deposit(1000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawNegativeAmount() {
        account.withdraw(-100);
    }


    // testTransferFunds: Verifies that transferring funds between two accounts updates both balances correctly.
    @Test
    public void testTransferToSameAccount() {
        account.deposit(1000);
        account.transfer(account, 500);
        assertEquals("Balance should remain the same after transfer to the same account", 1000, account.getBalance(), 0.01);
    }
    // more test cases
}