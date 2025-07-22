package _9_oops.finalKeyword;

public class Demo2 {
    public static void main(String[] args) {
        class Parent {
            final void m1() {
                System.out.println("Parent::m1 method");

            }
        }
        class Child extends Parent {
            //CTE : final method cannot be overridden
           /* @Override
            void m1() {
                System.out.println("Child::m1 method");
            }*/
        }
    }
}
