package _7_class_components;

public class Demo11 {
    public static void main(String[] args) {
        class BankAccount {
            int accountNo;
            String name;
            double balance;

            void deposit(double amount) {
                balance = balance + amount;
            }

            void withdraw(double amount) {
                if (checkBalance() > 0) {
                    balance = balance - amount;
                }
            }

            double checkBalance() {
                System.out.println("Balance: " + balance);
                return balance;
            }
        }
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(500);
        //this.deposit(1000);//CTE
    }
}
