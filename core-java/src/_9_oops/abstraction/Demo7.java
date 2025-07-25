package _9_oops.abstraction;

public class Demo7 {
    public static void main(String[] args) {

        interface I1{
            void m1();
        }
        interface I2{
            void m2();
        }
        class A implements I1, I2{
            @Override
            public void m1() {
                System.out.println("m1");
            }

            @Override
            public void m2() {
                System.out.println("m2");
            }
        }
        A a = new A();
        a.m1();
        a.m2();
    }
}
