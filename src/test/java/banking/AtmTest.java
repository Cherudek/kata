package banking;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtmTest {

    private String heading;
    private String depositTransaction;
    private String withdrawalTransaction;
    private Atm atm;

    @BeforeEach
    void setUp() {
        heading = "Date  Amount  Balance \n";
        String date = "14.08.2021";
        String deposit = "+10";
        String withdrawal = "-5";
        String depositBalance = "20";
        String withdrawalBalance = "5";
        depositTransaction = date + " | " + deposit + " | " + depositBalance + "\n";
        withdrawalTransaction = date + " | " + withdrawal + " | " + withdrawalBalance + "\n";
        atm = new Atm();
    }


    @Test
    void itPrintsAnEmptyTransactionHeading() {
        assertEquals(heading, atm.printStatement());
    }

    @Test
    void itPrintsADepositStatement() {
        atm.deposit(10);
        assertEquals(heading + depositTransaction, atm.printStatement());
    }

    @Test
    void itPrintsAWithdrawalStatement() {
        atm.withdraw(5);
        assertEquals(heading + withdrawalTransaction, atm.printStatement());
    }

    @Test
    void itRecordsTwoTransaction() {
        String expectedTransactions = "Date  Amount  Balance \n" +
                                       "14.08.2021 | +10 | 20\n" +
                                       "14.08.2021 | -5 | 15\n";

        atm.deposit(10);
        atm.withdraw(5);
        Assertions.assertEquals(expectedTransactions, atm.printStatement());
    }

}