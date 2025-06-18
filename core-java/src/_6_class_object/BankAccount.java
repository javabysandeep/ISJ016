package _6_class_object;

public class BankAccount {
    int customerId;
    int accountNumber;
    int balance;
    String accountType;
    String accountHolderName;

    void deposit(int amount) {
        balance = balance + amount;
    }
    void withdraw(int amount) {
        balance = balance - amount;
    }

}
