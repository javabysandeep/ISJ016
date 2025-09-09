package _14_exception_handling;

public class Demo8 {
    public static void main(String[] args) {
        //finally {} //independent try, catch and finally are not allowed --CTE

        try {
            System.out.println(10 / 0);
        } finally {
            System.out.println("finally block");
        }
        System.out.println("rest of the main");
    }
}
//output :
// finally block
// exception
