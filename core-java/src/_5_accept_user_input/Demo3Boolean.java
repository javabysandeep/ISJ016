package _5_accept_user_input;

import java.util.Scanner;

public class Demo3Boolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter true or false: ");
        boolean input = sc.nextBoolean();
        System.out.println("you have entered " + input);

    }
}
