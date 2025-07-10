package _9_oops.inheritance;

public class Demo3 {
    public static void main(String[] args) {
        //01. single level inheritance
        class A{}
        class B extends A{}

        //02. multi level inheritance
        class P {}
        class Q extends P{}
        class R extends Q{}


        //03. multiple  inheritance
        class S{
            void m1(){}
        }
        class T{
            void m1(){}
        }
        //class U extends S, T{} //CTE multiple inheritance is not supported through classes

        interface I11{}
        interface I12{}
        class C1 implements I11,I12{} // multiple inheritance supported in java through interfaces


        //04. cyclic  inheritance
            //class A1 extends A1{} //CTE : not supported in java

        //05. hierarchical  inheritance
        class Employee{}
        class Fte extends Employee{}
        class C2h extends Employee{}


        //06. hybrid  inheritance
        //combination of multiple and any other type
        class C2 extends C2h implements I11,I12{}

    }
}
