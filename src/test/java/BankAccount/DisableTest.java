package BankAccount;

import org.example.BankAccount;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ParameterResolverTest.class)
public class DisableTest {
    @Test
    @Disabled("Disabled for the good of science")
    @DisplayName(" Deposit 500 success!")
    public void depositTest(BankAccount bankAccount) {
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }
}
