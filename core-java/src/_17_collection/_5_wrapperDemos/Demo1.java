package _17_collection._5_wrapperDemos;

public class Demo1 {
    public static void main(String[] args) {
        int a = 100; // primitive value
        Integer b  = a;//auto boxing ---> convert primitive to object
        int c = b; //unboxing ----> convert object to primitive
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
