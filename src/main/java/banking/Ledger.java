package banking;

import java.util.List;

public interface Ledger {
    void deposit(int amount);
    void withdraw(int amount);
    List<String> getTransactions();
    void recordTransaction(String transaction);
}
