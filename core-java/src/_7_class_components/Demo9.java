package _7_class_components;

public class Demo9 {
    public static void main(String[] args) {
        System.out.println("addition of two numbers is " + add(100, 20));
        System.out.println("addition of two numbers is " + add(100.5f, 20.0f));
        System.out.println("addition of three numbers is " + add(100, 20, 30));
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    private static float add(float number1, float number2) {
        return number1 + number2;
    }

    private static int add(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }
}
