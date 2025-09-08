package _14_exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) {
        m1();
        System.out.println("main method");
    }

    public static void m1() {
        System.out.println(10 / 0);
        System.out.println("rest of the main");
/*        ArithmeticException; //---> problematic situation
        ArrayIndexOutOfBoundsException;
        FileNotFoundException;
        NullPointerException;
        NegativeArraySizeException;
        IOException;*/

    }
}
