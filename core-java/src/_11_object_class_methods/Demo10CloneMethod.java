package _11_object_class_methods;

public class Demo10CloneMethod {
    public static void main(String[] args) throws CloneNotSupportedException {
        class Student implements Cloneable {
            int id;
            String name;

            Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            Student() {
            }

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
        Student s1 = new Student(101, "Vishnu");
        Student s2 = (Student) s1.clone();
        System.out.println(s1 + "\t" + s1.hashCode());
        System.out.println(s2 + "\t" + s2.hashCode());

    }
}
