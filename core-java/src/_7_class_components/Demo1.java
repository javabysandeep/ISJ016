package _7_class_components;

public class Demo1 {
    int x = 1;
    int y = 2;
    static int z = 3;

    public static void main(String[] args) {
        int a; // declaration
        a = 100; //initialization
        a = 200; //assignment

        int b;
       // System.out.println("b = "+b);//cte
        //local variables do not get default value

        int x = 10;//declaration, initialization
        int y = 20;
        int z = 30;
        System.out.println("********** local variable ***************");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("************ Static variable *************");
        System.out.println("z = " + Demo1.z);

        System.out.println("************* instance variable ***********");
        Demo1 obj = new Demo1();
        System.out.println("x = " + obj.x);
        System.out.println("y = " + obj.y);
    }
}
