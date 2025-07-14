package _9_oops.inheritance;

public class Demo9 {
    public static void main(String[] args) {
        class Parent {
            int x = 1;
            int y = 2;
            int z = 3;
        }

        class Child extends Parent {
            int x = 10;
            int y = 20;
            int w = 99;
        }

        //02 . Child ref = new Child();
        //01. If members are present in only parent class, then access it from Parent class
        //02. If members are present in only child class, then access it from Child class
        //03. If members are present in both parent and child class, then access it from Child class

        Child ref = new Child();
        System.out.println("x = " + ref.x); //10 ---> from child class
        System.out.println("y = " + ref.y); //20 ---> from child class
        System.out.println("z = " + ref.z); //3 ---> from parent class
        System.out.println("w = " + ref.w); //99 ---> from child class



    }
}
