package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void deposit(int deposit) {
        this.balance = balance + deposit;
    }
    public void withdraw(int withdraw) {
        this.balance = balance - withdraw;
    }
    public int transfer(BankAccount to, int amount) {
        to.deposit(amount);
        this.withdraw(amount);
        return balance;
    }
    public String getInfo() {
        return owner  + " (" + accountNumber + "): " + balance + " Ft";
    }
}
