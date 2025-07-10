package _9_oops.inheritance;

public class Demo1 {
    public static void main(String[] args) {

        //01. what is inheritance
        //02.  why to use inheritance
        //03. how to use inheritance

        //nested class ---> local inner class

        class BankAccount {
            int customerId;
            int accountNumber;
            String accountHolderName;
            double balance;

            void deposit(double amount) {
                balance = balance + amount;
            }

            void withdraw(double amount) {
                balance = balance - amount;
            }

            double getBalance() {
                return balance;
            }
        }

        //single level inheritance

        class SavingsAccount extends BankAccount {
            //
        }

        //SavingAccount IS-A type of BankAccount

        SavingsAccount savingsAccount = new SavingsAccount();
        savingsAccount.customerId = 1;
        savingsAccount.accountNumber = 1;
        savingsAccount.accountHolderName = "John Doe";
        savingsAccount.balance = 10000;
        savingsAccount.deposit(500);


        System.out.println("Customer ID "+savingsAccount.customerId);
        System.out.println("Account Number "+savingsAccount.accountNumber);
        System.out.println("Account Holder Name "+savingsAccount.accountHolderName);
        System.out.println("current balance " + savingsAccount.getBalance());




    }
}
