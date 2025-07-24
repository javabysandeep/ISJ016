package _9_oops.abstraction;

public class Demo2 {
    public static void main(String[] args) {
        abstract class A {
            int iv = 1;
            static int sv = 2;

            void im() {
                System.out.println("instance method");
            }

            static void sm() {
                System.out.println("static method");
            }

            A() {
                System.out.println("Constructor of A class");
            }

            {
                System.out.println("instance block of A");
            }

            static {
                System.out.println("static block of A");
            }

            static class NestedClass {
            }

            public abstract void m1();

        }
    }
}
