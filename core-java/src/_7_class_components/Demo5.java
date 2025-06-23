package _7_class_components;

public class Demo5 {
    public static void main(String[] args) {
        System.out.println("Addition is " + add(100, 200));
        System.out.println("Addition is " + Demo5.add(100, 200));

        Demo5 demo5Ref = new Demo5();
        System.out.println("Subtraction is "+demo5Ref.sub(200,100));
    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public int sub(int number1, int number2) {
        return number1 - number2;
    }
}
