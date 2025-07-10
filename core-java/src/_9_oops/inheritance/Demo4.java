package _9_oops.inheritance;

public class Demo4 {
    public static void main(String[] args) {
        class A {
            static {
                System.out.println("A::static block");
            }

            {
                System.out.println("A::instance block");
            }

            A() {
                //01. super class constructor
                //02. same class instance block
                super();
                System.out.println("A::constructor");
            }
        }

        class B extends A {
            static {
                System.out.println("B::static block");
            }

            {
                System.out.println("B::instance block");
            }

            B() {
                //01. super class constructor
                //02. same class instance block
                super();
                System.out.println("B::constructor");
            }
        }

        B b = new B();
        //output
        //01. A::static block
        //02. B::static block
        //03. A::instance block
        //04. A::constructor
        //05. B::instance block
        //06. B::constructor
    }
}
