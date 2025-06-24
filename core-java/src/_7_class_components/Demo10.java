package _7_class_components;

public class Demo10 {
    //JRE will main method with below signature
    public static void main(String[] arguments) {
        System.out.println("main method");
        main("good morning");
    }

    public static void main(String argument) {
        System.out.println("main method overloaded");
    }
}
