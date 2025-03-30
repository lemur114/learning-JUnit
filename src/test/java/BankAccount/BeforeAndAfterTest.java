package BankAccount;

import org.example.BankAccount;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAndAfterTest {
    static BankAccount bankAccount ;

/*
    @BeforeAll
    public void setUp() {
        System.out.println("Test setup");
        bankAccount = new BankAccount(0, 0);

    }
*/


    @BeforeAll
    public static void setUp() {
        System.out.println("Test setup");
        bankAccount = new BankAccount(0, 0);

    }

    @Test
    public void withdrawTest() {
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());

    }


    @Test
    public void depositTest() {
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }

    @AfterAll
    public static void endTest() {
        System.out.println("Test end");
    }
}
