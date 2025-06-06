package _3_operators;

public class Demo11IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("Pre-decrement");
        int a = 10;
        int b = --a;
        System.out.println("a = " + a);//9
        System.out.println("b = " + b);//9

        System.out.println("Post-decrement");
        int c = 10;
        int d = c--;
        System.out.println("c = " + c);//9
        System.out.println("d = " + d);//10
    }
}
