package _4_controlStatements._2_looping._2_whiledemos;

public class Demo7PalindromeNumber {
    public static void main(String[] args) {

        //palindrome : given number = reverse of it

        int number = 153;
        int oldNumber = number;
        int rev = 0;
        while (number > 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number /= 10;
        }

        System.out.println("reverse of " + oldNumber + " is " + rev);

        // 123 % 10 ---> 3

        // 12 % 10 ---> 2

        //1 % 10 --> 1

        System.out.println(oldNumber == rev ? "palindrome" : "not palindrome");
    }
}
