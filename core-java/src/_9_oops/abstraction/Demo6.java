package _9_oops.abstraction;

public class Demo6 {
    public static void main(String[] args) {

        interface I1 {
            //01. variables by default will be public static final
            public static final int variable =100;
            int a = 10; //public static final int a = 20;

            //02. methods : by default they are public abstract
            public abstract void m1();
            void m2(); //similar to public abstract void m2();
            //void m3(){} //instance methods are not allowed ---> CTE
            static void m4(){} //static methods are allowed from java 8
            default void m5(){} // default methods are allowed from java 8

            //03. constructors are not allowed
            //I1(){}//CTE

            //04. blocks are not allowed
            //{}
            //static {}


            //05. nested classes : by default are public static
            public static class Nested{}

            //in nutshell : no confusing members


        }
    }
}
