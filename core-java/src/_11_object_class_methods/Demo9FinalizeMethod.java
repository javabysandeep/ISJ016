package _11_object_class_methods;

public class Demo9FinalizeMethod {
    public static void main(String[] args) {
        class Student{
            int id;
            String name;

            @Override
            protected void finalize() throws Throwable {
                System.out.println("finalize method");
            }
        }
        Student s1 = new Student();
        s1 = null;
        Student s2 = new Student();
        Student s3 = new Student();
        s3 = s2;

        //calling GC explicitly
        System.gc();
    }
}
