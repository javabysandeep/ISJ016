package _7_class_components;

public class Demo16 {
    public static void main(String[] args) {
        //access the A class i.e. static nested class members
        Outer.A ref = new Outer.A();
        System.out.println("instance variable x =" + ref.x);
        System.out.println("static variable y =" + Outer.A.y);
        ref.m1();
        Outer.A.m2();//static method

        System.out.println("Outer var " + Outer.var);
    }
}
