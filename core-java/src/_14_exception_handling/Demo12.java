package _14_exception_handling;

public class Demo12 {
    public static void main(String[] args) {
        System.out.println(getNumber());//3 --> from finally block
    }

    private static int getNumber() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

}
