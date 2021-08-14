package banking;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Atm implements Ledger, Printer, Clock {

    int balance = 10;
    List<String> transactions = new ArrayList<>();

    @Override
    public void deposit(int amount) {
        balance += amount;
        recordTransaction("+" + amount);
    }

    @Override
    public void withdraw(int amount) {
        balance -= amount;
        recordTransaction("-" + amount);
    }

    @Override
    public String printStatement() {
        return formatTransactions();
    }

    @Override
    public void recordTransaction(String amount) {
        String transaction = transactionTime() + " | " + amount + " | " + balance;
        transactions.add(transaction);
    }

    private String formatTransactions() {
        StringBuilder builder = new StringBuilder();
        builder.append("Date  Amount  Balance \n");
        String regex = "[\\[\\]]";
        transactions.stream()
                .map(x -> x.replaceAll(regex, ""))
                .collect(Collectors.toList())
                .forEach(x -> builder.append(x).append("\n"));
        return builder.toString();
    }

    @Override
    public String transactionTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        ZonedDateTime zonedDateTimeOf = ZonedDateTime.of(2021, 8, 14, 0, 0, 0, 0, ZoneId.of("UTC"));
        return zonedDateTimeOf.format(formatter);
    }

    @Override
    public List<String> getTransactions() {
        return transactions;
    }

}
