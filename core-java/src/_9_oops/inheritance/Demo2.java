package _9_oops.inheritance;

public class Demo2 {
    public static void main(String[] args) {
       // permutations of inheritance

        class A {}
        class B{}
        interface I1{}
        interface I2{}

        //valid cases
        //01. class extends class
        class C extends A{}

        //02. interface extends more than one interface
        interface I3 extends I1, I2{}

        //03. class implements interfaces
        class D implements I1, I2, I3 {}

        //interface I4 extends D{} //CTE
    }
}
