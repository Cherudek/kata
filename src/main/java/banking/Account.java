package banking;

public class Account {

    Atm atm;

    public Account(Atm atm) {
        this.atm = atm;
    }

    void deposit(int amount){
        atm.deposit(amount);
    }

    void withdraw(int amount){
        atm.withdraw(amount);
    }

    String printStatement(){
        return atm.printStatement();
    }

}
