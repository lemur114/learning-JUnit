package BankAccount;

import org.example.BankAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class AssumptionsTest {

    @Test
    @DisplayName("Test activation account after creation")
    public void activeTest(){
        BankAccount bankAccount = new BankAccount(-500, 500);
        assumingThat(bankAccount == null , ()->  assertTrue(bankAccount.isIs_active()) );
    }

    @Test
    @DisplayName("Test activation account after creation")
    public void activeAssumingTrueTest(){
        BankAccount bankAccount = new BankAccount(-500, 500);
        assumeTrue(bankAccount == null);
        assertTrue(bankAccount.isIs_active());
    }
}
