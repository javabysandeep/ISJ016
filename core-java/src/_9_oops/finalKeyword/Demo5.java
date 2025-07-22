package _9_oops.finalKeyword;

public class Demo5 {
    public static void main(String[] args) {

        //what is immutable class?
        // once object is create it cannot be modified
        class Student {
            final int id;
            final String name;
            final static String collegeName;

            static {
                collegeName = "PU";
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }
        }
        Student s1 = new Student(101, "Sachin");
        //s1.id = 1000;
        //s1.name = "abbbbbb";

        System.out.println("s1 " + s1.id + " " + s1.name);

        Student s2 = new Student(102, "Ganesh");
        System.out.println("s2 " + s2.id + " " + s2.name);
        System.out.println("College Name " + Student.collegeName);
    }
}
