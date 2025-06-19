package _6_class_object;

public class Demo3 {
    int a = 1;
    int b = 2;
    static int c = 3;

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("Local variables ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);//local

        System.out.println("Static variable");
        System.out.println("c = " + Demo3.c);//static

        System.out.println("Instance variable");
        Demo3 obj = new Demo3();
        System.out.println("a = " + obj.a);//instance
        System.out.println("b = " + obj.b);//instance
    }
}
