public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //loading a class in the memory
        //01. by creating the object
        //02. by using Class.forName() method
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();

        //load the class using Class.forName() method
        Class.forName("Employee");
    }
}
