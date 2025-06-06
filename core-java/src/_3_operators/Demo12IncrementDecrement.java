package _3_operators;

public class Demo12IncrementDecrement {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        System.out.println(++a + b++ + --c + a++ - ++d + --b); //5
        //a=3 ; b=2  ;   c=2    d=5
        //2+2+2+2-5+2=5

        System.out.println("a = " + a);//3
        System.out.println("b = " + b);//2
        System.out.println("c = " + c);//2
        System.out.println("d = " + d);//5
    }
}
