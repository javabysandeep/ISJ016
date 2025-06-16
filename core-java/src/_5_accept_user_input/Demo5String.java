package _5_accept_user_input;

import java.util.Scanner;

public class Demo5String {
    public static void main(String[] args) {
        System.out.println("Enter a String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("You have entered " + str);
    }
}
