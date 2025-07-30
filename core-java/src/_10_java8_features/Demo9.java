package _10_java8_features;

public class Demo9 {
    public static void main(String[] args) {
        interface Predicate {
            boolean test(int number);
        }
        Predicate isEven =  number -> number % 2 == 0;
        System.out.println("is even: " + isEven.test(2));//true
        System.out.println("is even: " + isEven.test(3));//false
    }
}
