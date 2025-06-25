package _7_class_components;

public class A {
    {
        System.out.println("A::instance block");

    }

    static {
        System.out.println("A::static block");
    }

    A() {
        System.out.println("A::constructor");
    }
}
