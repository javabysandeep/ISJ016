package _10_java8_features;

public class Demo12 {
    public static void main(String[] args) {
        interface Processor {
            public static void m1() {
                System.out.println("Processor static method m1");
            }
            public static void m2() {
                System.out.println("Processor static method m2");
            }
        }
        Processor.m1();//calling static method of Interface
        Processor.m2();
    }
}
