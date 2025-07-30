package _10_java8_features;

public class Demo14 {
    public static void main(String[] args) {
        interface I1{
            default void m1(){
                System.out.println("I1::m1");
            }
        }

        interface I2{
            default void m1(){
                System.out.println("I2::m1");
            }
        }

        class A implements I1, I2{
            @Override
            public void m1() {
                // we can interface default methods if want
                I1.super.m1();//call to the interface I1 default method
                I2.super.m1();//call to the interface I2 default method
                System.out.println("A::m1");
            }
        }
        A a = new A();
        a.m1();
    }
}
