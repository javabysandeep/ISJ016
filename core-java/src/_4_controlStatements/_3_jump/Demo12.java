package _4_controlStatements._3_jump;

public class Demo12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main method");

        //1, 2
    }
}
