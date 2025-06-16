package _5_accept_user_input;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //accept user input[number, char, boolean, String]
        //Scanner class ---> java.util
        //methods ---> nextXXX
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a short number: ");
        short shortValue = sc.nextShort();
        System.out.println("You entered: " + shortValue);

        //input mismatch

    }
}
