package _10_java8_features;

public class Demo13 {
    public static void main(String[] args) {
        interface List {
            void m1();
            //void m2();//this will break the subclasses
            default void m2(){
                System.out.println("Default method");
            }
        }
        class A implements List{
            @Override
            public void m1() {
                System.out.println("A::m1");
            }
        }

        class B implements List{
            @Override
            public void m1() {
                System.out.println("B::m1");
            }
        }

        class C implements List{
            @Override
            public void m1() {
                System.out.println("B::m1");
            }
        }

        class D implements List{
            @Override
            public void m1() {
                System.out.println("B::m1");
            }

            @Override
            public void m2() {
                System.out.println("D::m2");
            }
        }

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.m2();
        b.m2();
        c.m2();
        d.m2();
    }
}
