package _7_class_components;

public class Outer {
    static int var = 100;
    static class A {
        int x = 100;
        static int y = 200;

        void m1() {
            System.out.println("Outer::A---> m1 instance method");
        }

        static void m2() {
            System.out.println("Outer::A---> m2 static method");
        }
    }
}
