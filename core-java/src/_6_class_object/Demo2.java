package _6_class_object;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("*********** static variable ********");
        System.out.println(BankAccount.bankName);

        System.out.println("*********** instance variable ********");
        BankAccount ref = new BankAccount();
        System.out.println("customer id = " + ref.customerId);
        System.out.println("account number = " + ref.accountNumber);
        System.out.println("account holder name = " + ref.accountHolderName);
        System.out.println("account balance = " + ref.balance);
        System.out.println("Account type = " + ref.accountType);

        System.out.println("*************** Local variable ***********");
        int age = 30;
        System.out.println("Local variable age = " + age);
    }
}
