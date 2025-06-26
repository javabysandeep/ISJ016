package _7_class_components;

public class Demo15 {
    public static void main(String[] args) {
        class A {
            {
                System.out.println("A::instance block");
            }

            static {
                System.out.println("A::static block");
            }

            A() {
                super();
                System.out.println("A::constructor");
            }
        }
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        A a4 = new A();
    }
}
