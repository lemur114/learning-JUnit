package BankAccount;

import org.example.BankAccount;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

//For all test in class
//@Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
@ExtendWith(ParameterResolverTest.class)
public class TimeoutTest {

    @Test
    @Timeout(value = 400, unit = TimeUnit.MILLISECONDS)
    public void depositTimeoutTest(BankAccount bankAccount) {
        try{
            Thread.sleep(300);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());


    };
}
