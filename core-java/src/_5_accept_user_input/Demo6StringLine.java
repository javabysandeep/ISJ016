package _5_accept_user_input;

import java.util.Scanner;

public class Demo6StringLine {
    public static void main(String[] args) {
        System.out.println("Enter a String ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("You have entered " + str);
    }
}
