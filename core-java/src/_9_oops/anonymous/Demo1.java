package _9_oops.anonymous;

public class Demo1 {
    public static void main(String[] args) {
        //create subclass of each of these
        //01. traditional way of creating subclass of concrete, abstract and interface
        class A {}
        class ChildA extends A {}
        A a = new ChildA();

        abstract class B {}
        class ChildB extends B {}
        B b = new ChildB();

        interface C{}
        class ChildC implements C{}
         C c= new ChildC();

    }
}
