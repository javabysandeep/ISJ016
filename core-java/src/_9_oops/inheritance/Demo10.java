package _9_oops.inheritance;

public class Demo10 {
    public static void main(String[] args) {
        class Parent {
            int x = 1;
            int y = 2;
            int z = 3;

            void display() {
                System.out.println("parent");
            }
        }

        class Child extends Parent {
            int x = 10;
            int y = 20;
            int w = 99;

            void display() {
                System.out.println("child");
            }
        }

        //case 03 : Parent ref = new Child();
        //01. If members are present in only parent class, then access it from Parent class
        //02. If members are present in only child class, then CTE
        //03. If members are present in both parent and child class, then access variables from Parent class and Methods from Child Class

        Parent ref = new Child();
        System.out.println("x = " + ref.x); //1 ---> from parent class
        System.out.println("y = " + ref.y); //2 ---> from parent class
        System.out.println("z = " + ref.z); //3 ---> from parent class
        //System.out.println("w = " + ref.w); //CTE
        ref.display();//from child class



    }
}
