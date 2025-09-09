package _14_exception_handling;

public class Demo9 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 1);
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");
    }
}
//output :
//10
// finally block
// rest of the main
