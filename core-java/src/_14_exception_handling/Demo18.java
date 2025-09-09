package _14_exception_handling;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Demo18 {
    public static void main(String[] args) {
       /* FileNotFoundException;
        NullPointerException;
        ArithmeticException;*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the email address");
        String email = scanner.nextLine();
        if (!email.contains("@")) {
            throw new InvalidEmailFormatException("Invalid email format");
        }
        System.out.println("email provided is " + email);
    }
}
