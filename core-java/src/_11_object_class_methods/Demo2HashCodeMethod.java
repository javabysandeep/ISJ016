package _11_object_class_methods;

public class Demo2HashCodeMethod {
    public static void main(String[] args) {
        class Student{
            int id;
            String name;
        }
        Student s1 = new Student();
        //s1 ---> {id=0, name=null}

        Student s2 = s1;
        //s2 ---> {id=0, name = null}

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
