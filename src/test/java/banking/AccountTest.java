package banking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    Account account;
    Atm atm;
    String depositTransaction;
    String withdrawalTransaction;
    String heading;
    private String depositWithdrawalTransaction;

    @BeforeEach
    void setUp() {

        String date = "14.08.2021";
        String deposit = "+10";
        String withdrawal = "-5";
        String withdrawalBalance = "5";
        String depositBalance = "20";
        String depositWithdrawalBalance = "15";
        heading = "Date  Amount  Balance \n";
        depositTransaction = date + " | " + deposit + " | " + depositBalance + "\n";
        withdrawalTransaction = date + " | " + withdrawal + " | " + withdrawalBalance + "\n";
        depositWithdrawalTransaction = "Date  Amount  Balance \n" +
                                        "14.08.2021 | +10 | 20\n" +
                                        "14.08.2021 | -5 | 15\n";
        atm = new Atm();
        account = new Account(atm);
    }

    @Test
    void itPrintsAStatementsAfterADeposit() {
        account.deposit(10);
        assertEquals(heading + depositTransaction, account.printStatement());
    }

    @Test
    void itPrintsAStatementsAfterAWithdrawal() {
        account.withdraw(5);
        assertEquals(heading + withdrawalTransaction, account.printStatement());
    }

    @Test
    void itPrintsAStatementsWithTwoTransactions() {
        account.deposit(10);
        account.withdraw(5);
        assertEquals(depositWithdrawalTransaction, account.printStatement());
    }
}