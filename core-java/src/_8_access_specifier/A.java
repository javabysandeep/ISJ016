package _8_access_specifier;

public class A {
    static private int x = 1;
    static int w = 4;
    static protected int y = 2;
    static public int z = 3;

    //accessing within the same class
    public static void main(String[] args) {
        System.out.println("A::x=" + A.x);//private
        System.out.println("A::y=" + A.y);//default
        System.out.println("A::z=" + A.z);//protected
        System.out.println("A::w=" + A.w);//public
    }
}
