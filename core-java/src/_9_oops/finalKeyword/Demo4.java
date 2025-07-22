package _9_oops.finalKeyword;

public class Demo4 {
    public static void main(String[] args) {
        class Student {
            final int id = 101;
            final String name = "abc";
        }
        Student s1 = new Student();
        System.out.println("s1 " + s1.id + " " + s1.name);
        Student s2 = new Student();
        System.out.println("s2 " + s2.id + " " + s2.name);
    }
}
