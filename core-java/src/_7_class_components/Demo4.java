package _7_class_components;

public class Demo4 {
    public static void main(String[] args) {

        class B {
            void m1(){


            }
            static void m2(){

            }
        }
        class A {
            void m1(){
                B bRef = new B();
                bRef.m1();

                B.m2();
                bRef.m2();
            }
            static void m2(){

            }
        }


    }

}
