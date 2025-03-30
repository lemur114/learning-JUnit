package BankAccount;

import org.example.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {

    @Test
    public void withdrawTest() {
        BankAccount bankAccount = new BankAccount(-500, 500);
        bankAccount.withdraw(500);
        assertEquals(0, bankAccount.getBalance());

    }

    @Test
    @DisplayName(" Deposit 500 success!")
    public void depositTest() {
        BankAccount bankAccount = new BankAccount(-500, 500);
        bankAccount.deposit(500);
        assertEquals(1000, bankAccount.getBalance());
    }

    @Test
    public void withdrawNotStuckAtZeroTest(){
        BankAccount bankAccount = new BankAccount(-500, 500);
        bankAccount.withdraw(800);
        assertNotEquals(0, bankAccount.getBalance());

    }

    @Test
    @DisplayName("Test activation account after creation")
    public void activeTest(){
        BankAccount bankAccount = new BankAccount(-500, 500);
        assertTrue(bankAccount.isIs_active());

    }

    @Test
    public void holderNameTest(){
        BankAccount bankAccount = new BankAccount(-500, 500);
        bankAccount.setHolderName("Eliot");
        assertNotNull(bankAccount.getHolderName());

    }


    @Test
    public void noWithdrawBellowMinimumTest(){
        BankAccount bankAccount = new BankAccount(-500, 500);
        assertThrows(RuntimeException.class, () -> {bankAccount.withdraw(1000);});
    }

    @Test
    public void withdrawAndDepositWithoutExceptionTest(){
        BankAccount bankAccount = new BankAccount(-500, 500);
        assertAll(()->bankAccount.withdraw(500), ()->bankAccount.deposit(500));
    }

    @Test
    public void depositTimeoutTest(){
        BankAccount bankAccount = new BankAccount(-500, 500);
        assertTimeout(Duration.ofNanos(1), () -> {bankAccount.deposit(500);});
    }


}
