package BankAccount;

import org.example.BankAccount;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NestedTest {

    @Test
    public void withdrawTest() {
        BankAccount bankAccount = new BankAccount(-500, 500);
        bankAccount.withdraw(500);
        assertEquals(0, bankAccount.getBalance());

    }

    @Test
    public void depositTest() {
        BankAccount bankAccount = new BankAccount(-500, 500);
        bankAccount.deposit(500);
        assertEquals(1000, bankAccount.getBalance());
    }

    @Nested
    class WhenBalanceIsZeroTest{
        @Test
        public void withdrawMinimumBalanceIs0(){
            BankAccount bankAccount = new BankAccount(0, 0);
            assertThrows(RuntimeException.class, () -> bankAccount.withdraw(500));
        }

        @Test
        public void withdrawMinimumBalanceIsNegative1000(){
            BankAccount bankAccount = new BankAccount(-1000, 0);
            bankAccount.withdraw(500);
            assertEquals(-500, bankAccount.getBalance());
        }

    }

}
