package _9_oops.abstraction;

public class Demo1 {
    public static void main(String[] args) {
        //concrete class
        class A {
            //CTE : we cannot write abstract method inside the concrete class
            //public abstract void m1();//abstract method

            //concrete method
            public void m2() {
                System.out.println("concrete method: with body and without abstract keyword");
            }
        }


        // abstract class
        abstract class B {

            //abstract method
            public abstract void m1();//abstract method
        }
    }
}
