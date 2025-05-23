package BankAccount;

import org.example.BankAccount;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ExecutionOrderTest {

   static BankAccount bankAccount = new BankAccount(0, 0);

    @Test
    @Order(2)
    public void withdrawTest() {
        bankAccount.withdraw(300);
        assertEquals(200, bankAccount.getBalance());

    }


    @Test
    @Order(1)
    public void depositTest() {
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }


}
