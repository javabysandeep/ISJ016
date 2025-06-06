package _3_operators;

public class Demo10IncrementDecrement {
    public static void main(String[] args) {
        System.out.println("Pre-increment");
        int a = 10;
        int b = ++a;//11
        System.out.println("a = " + a);//11
        System.out.println("b = " + b);//11

        System.out.println("Post-increment");
        int c = 10;
        int d = c++;
        System.out.println("c = " + c);//11
        System.out.println("d = " + d);//10
    }
}
