package _11_object_class_methods;

public class Demo7EqualsMethod {
    public static void main(String[] args) {

        class Student {
            int id;
            String name;
        }
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = s2;

        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//false
        System.out.println(s2.equals(s3));//true

    }
}
