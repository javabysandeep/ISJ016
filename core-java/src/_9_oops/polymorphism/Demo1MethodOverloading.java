package _9_oops.polymorphism;

public class Demo1MethodOverloading {
    public static void main(String[] args) {
        class Arithmetic {
            //method overloading
            int add(int number1, int number2) {
                return number1 + number2;
            }

            int add(int number1, int number2, int number3) {
                return number1 + number2 + number3;
            }

            float add(float number1, float number2) {
                return number1 + number2;
            }

        }
        Arithmetic ref = new Arithmetic();
        System.out.println(ref.add(10, 20));
        System.out.println(ref.add(10, 20, 30));
        System.out.println(ref.add(10.5f, 40.5f));

    }
}
