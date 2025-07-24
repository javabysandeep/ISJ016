package _9_oops.abstraction;

public class Demo4 {
    public static void main(String[] args) {
        abstract class A {
            A() {
                System.out.println("abstract class A ::constructor");
            }
        }

        //we cannot create object of an abstract class even though it is empty or not having abstract methods
        //A a = new A(); //CTE

        //want to execute A class constructor
        class B extends A {
            B() {
                super();
                System.out.println("B class : constructor");
            }
        }

        B b = new B();
    }
}
