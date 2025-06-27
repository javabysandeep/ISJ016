package _8_access_specifier.p1;

import _8_access_specifier.A;

public class B {
    public static void main(String[] args) {
        //accessing from outside the class and different package
        //System.out.println("A::x=" + A.x);//CTE: x is private
        // System.out.println("A::y=" + A.y);//CTE::protected
        System.out.println("A::z=" + A.z);//public
        //System.out.println("A::w=" + A.w);//CTE::default
    }
}
