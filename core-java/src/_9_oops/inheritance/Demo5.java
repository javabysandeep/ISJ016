package _9_oops.inheritance;

public class Demo5 {
    public static void main(String[] args) {

        //constructor chaining
        class A {
            A() {
                System.out.println("A::constructor");
            }
        }

        class B extends A {
            B() {
                System.out.println("B::constructor");
            }
        }

        class C extends B {
            C() {
                System.out.println("C::constructor");
            }
        }

        A a = new A(); // only A class
        B b = new B(); // A, B constructor
        C c = new C(); // A,B,C constructor
    }
}
