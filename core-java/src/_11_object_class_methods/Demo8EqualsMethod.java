package _11_object_class_methods;

public class Demo8EqualsMethod {
    public static void main(String[] args) {

        class Student {
            int id;
            String name;

            //equality check using content
            @Override
            public boolean equals(Object obj) {
                Student student = (Student) obj;
                return this.id == student.id;
            }
        }
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = s2;

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s2.equals(s3));//true

    }
}
