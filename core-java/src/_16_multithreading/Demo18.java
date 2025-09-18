package _16_multithreading;

public class Demo18 {
    public static void main(String[] args) throws InterruptedException {
        class BankAccount {
            int accountNumber;
            int balance;

            synchronized public void deposit(int amount) {
                balance = balance + amount;
            }

            synchronized public void withdraw(int amount) {
                balance = balance - amount;
            }
        }
        BankAccount bankAccount = new BankAccount();
        bankAccount.accountNumber = 123456789;

        Thread depositor = new Thread(() -> {
            for (int i = 1; i <= 100000; i++) {
                bankAccount.deposit(1);
            }
        }, "depositor");

        Thread withdrawer = new Thread(() -> {
            for (int i = 1; i <= 100000; i++) {
                bankAccount.withdraw(1);
            }
        }, "withdrawer");

        depositor.start();

        withdrawer.start();

        //main thread will wait for depositor and withdrawer thread
        depositor.join();
        withdrawer.join();

        System.out.println("Effective balance : " + bankAccount.balance);

    }
}
