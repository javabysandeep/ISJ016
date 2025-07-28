package _9_oops.anonymous;

public class Demo2 {
    public static void main(String[] args) {
        //create subclass of each of these
        //02. anonymous class way of creating subclass of concrete, abstract and interface
        class A {
        }

        abstract class B {
        }

        interface C {
        }

        //anonymous class

        //we have created object of an anonymous class that extends A class
        A a = new A() {
            //anonymous class body
        };

        B b= new B() {
            //anonymous class body
        };

        C c = new C() {
            //anonymous class body
        };

    }
}
