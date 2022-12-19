package tdd;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTwoTest {
    @Test
    void OpeningAccount() {
        AccountTwo account = new AccountTwo(2000, 5555);
        account.getBalance();
        assertEquals(2000, 5555);

    }


    @Test
    void WithDraw(){
        AccountTwo account = new AccountTwo();
        account.withdraw();
        double balance = account.getBalance();
        assertEquals(500,5555);
    }
    @Test
    void WrongPin() {
        AccountTwo account = new AccountTwo(double balance,int pin)
            double balance = account.withDraw(500, 5555);
            assertEquals(500,5555);
        }
        @Test
        void AccountNumber() {
            AccountTwo account = new AccountTwo(double balance,int pin);
            account.getBalance();
        }

    }

