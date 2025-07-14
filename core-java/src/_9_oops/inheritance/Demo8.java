package _9_oops.inheritance;

public class Demo8 {
    public static void main(String[] args) {
        class Parent {
            int x = 1;
        }

        class Child extends Parent {
            int x = 2;
            int y = 3;
        }
        //01 . Parent ref = new Parent();
        // we can access only parent class members and not child class
        Parent parentRef = new Parent();
        System.out.println("x = " + parentRef.x);//1
        //System.out.println("y = " + parentRef.y);//CTE


    }
}
