package _11_object_class_methods;

public class Demo5ToString {
    public static void main(String[] args) {

        class Student {
            int id;
            String name;

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
        Student s1 = new Student();
        System.out.println(s1.hashCode());
        System.out.println(s1.getClass().getName());
        System.out.println(s1.toString());
        System.out.println(s1);
    }
}
