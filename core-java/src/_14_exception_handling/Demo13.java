package _14_exception_handling;

import java.util.Scanner;

public class Demo13 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter two numbers: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println(a / b); //Arithmetic

            String str = "null";
            System.out.println(str.length()); //NullPointer

            int[] array = {1};
            System.out.println(array[1]); //ArrayIndexOutBouds
        } catch (ArithmeticException e) {
            System.out.println("invalid denominator");
        } catch (NullPointerException e) {
            System.out.println("null pointer");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid index");
        }
        //generic exception handler
        catch (Exception e) {
            System.out.println("exception " + e.getMessage());
        }
        System.out.println("rest of the main");
    }
}
