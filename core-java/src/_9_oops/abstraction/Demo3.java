package _9_oops.abstraction;

public class Demo3 {
    public static void main(String[] args) {
        abstract class A { }

        //we cannot create object of an abstract class even though it is empty or not having abstract methods
        //A a = new A(); //CTE
    }
}
