package _9_oops.inheritance;

public class Demo6 {
    public static void main(String[] args) {
        class Parent {
            int a = 1;
        }

        class Child extends Parent {
            int a = 2;

            void display() {
                System.out.println(a);
            }
        }

        Child child = new Child();

        System.out.println(child.a);//2 from child classes
    }
}
