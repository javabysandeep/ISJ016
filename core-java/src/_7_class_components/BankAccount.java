package _7_class_components;

public class BankAccount {
    int accountNumber;
    String accountHolderName;
    int balance;

    public void transfer(int amount) {
        checkBalance();
        this.checkBalance();
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}
