package BankAccount;

import org.example.BankAccount;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ParameterResolverTest.class)
public class ParameterizedTest {
    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(ints = {0, 100, 2})
    public void depositTest(int amount, BankAccount bankAccount) {
        bankAccount.deposit(amount);
        assertEquals(amount, bankAccount.getBalance());
    }

    @org.junit.jupiter.params.ParameterizedTest
    @CsvFileSource(resources = "/details.csv")
    public void depositAndNameTest(double amount,String name ,BankAccount bankAccount) {
        bankAccount.deposit(amount);
        bankAccount.setHolderName(name);
        assertEquals(amount, bankAccount.getBalance());
        assertEquals(name, bankAccount.getHolderName());


    }

}
