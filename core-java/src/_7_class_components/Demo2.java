package _7_class_components;

public class Demo2 {
    public static void main(String[] args) {
        System.out.println("addition "+add(10,20));//method call
        System.out.println("subtraction "+sub(100,20));
    }

    //method definition
   static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }
}
