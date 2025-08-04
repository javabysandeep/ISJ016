package _11_object_class_methods;

public class Demo6EqualityOperator {
    public static void main(String[] args) {

        class Student {
            int id;
            String name;
        }
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = s2;

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

    }
}
