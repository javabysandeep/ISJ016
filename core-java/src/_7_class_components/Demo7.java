package _7_class_components;

public class Demo7 {
    public static void main(String[] args) {
        class C{
            void m1(){
                System.out.println("C::m1");
            }
            void m2(){
                System.out.println("C::m2");
            }
            void m3(){
                System.out.println("C::m3");
            }
        }
        class B{
            C c = new C();
            void m1(){
                c.m1();
            }
            void m2(){
                c.m2();
            }
            void m3(){
                c.m3();
            }
        }
        class A{
            B b = new B();
            void m1(){
                b.m1();
            }
            void m2(){
                b.m2();
            }
            void m3(){
                b.m3();
            }
        }


        A a = new A();
        a.m1();
        a.m2();
        a.m3();
    }

}
