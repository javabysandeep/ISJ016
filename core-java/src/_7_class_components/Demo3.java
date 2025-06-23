package _7_class_components;

public class Demo3 {
    public static void main(String[] args) {
        m1();
    }
    public static void m1(){
        //call m2 method
        m2();
        Demo3.m2();

        //call m3, m4
        Demo3 ref = new Demo3();
        ref.m3();
        ref.m4();
    }
    public static void m2(){}

    public  void m3(){
    //call m4()
        m4();
        this.m4();

    // m2();
        m2();
        Demo3.m2();
        this.m2();

    }
    public  void m4(){}
}

