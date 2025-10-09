public class Demo2 {
    public static void main(String[] args) throws ClassNotFoundException {
        //load the class using Class.forName() method
        Class.forName("Employee");
        System.out.println("class is loaded in the memory");
    }
}
