package _7_class_components;

public class Demo20 {
    public static void main(String[] args) {
        class Student {
            int id;
            String name;

            void addStudent() {
                System.out.println("student added");
            }
        }
        Student s1 = new Student();
        System.out.println("Local inner class var " + s1.id);
        System.out.println("Local inner class var " + s1.name);
        s1.addStudent();
    }
}
