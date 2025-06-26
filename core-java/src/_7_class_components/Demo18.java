package _7_class_components;

public class Demo18 {
    int z;

    class Inner{
        //static int y = 200;//CTE  at java 8
        //static void m1(){} //CTE  at java 8
        //static {}//CTE at Java 8
        int x = 100;
        void m1(){
            System.out.println("Inner class ::m1 instance method");
        }
    }

    public static void main(String[] args) {
        Demo18 outerObj = new Demo18();
        Inner inner = outerObj.new Inner();
        System.out.println("Inner class instance variable x ="+inner.x);
        inner.m1();//inner class instance method m1
    }
}
