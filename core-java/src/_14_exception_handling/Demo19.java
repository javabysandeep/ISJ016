package _14_exception_handling;

import java.util.Scanner;

public class Demo19 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the email address");
            String email = scanner.nextLine();
            if (!email.contains("@")) {
                throw new InvalidEmailFormatException("Invalid email format");
            }

        } catch (InvalidEmailFormatException ex) {
            System.out.println("Invalid email format");
        }
    }
}
