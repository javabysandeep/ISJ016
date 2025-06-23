package _7_class_components;

import java.io.PrintStream;

public class Demo8 {
    public static void main(String[] args) {
        class PrintStream {
            void println(Object x) {

            }
        }
        class System{
            public static PrintStream out = new PrintStream();
        }


        System.out.println("Hello World");
    }
}

