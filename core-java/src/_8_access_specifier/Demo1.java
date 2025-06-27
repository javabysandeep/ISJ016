package _8_access_specifier;

public class Demo1 {
    public static void main(String[] args) {
        //accessing within the outside the class but within the same package
        //System.out.println("A::x=" + A.x);//CTE: x is private
        System.out.println("A::y=" + A.y);//public
        System.out.println("A::z=" + A.z);//protected
        System.out.println("A::w=" + A.w);//default
    }
}
