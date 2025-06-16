package _5_accept_user_input;

import java.util.Scanner;

public class Demo4Char {
    public static void main(String[] args) {
        System.out.println("Enter a char ");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println("You have entered "+ch);
    }
}
