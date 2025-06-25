package _7_class_components;

public class Demo13 {
    public static void main(String[] args) {
        class A {
            int x;
            int y;
            A(int x, int y) {
                this.x = x;
                this.y = y;
            }
            A(){
                this(100, 200);
                System.out.println("zero param body");

            }
        }

        A a = new A();
        System.out.println("a: " + a.x);
        System.out.println("a: " + a.y);
    }
}
