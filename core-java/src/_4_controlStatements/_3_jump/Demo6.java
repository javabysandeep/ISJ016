package _4_controlStatements._3_jump;

public class Demo6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {

            if (i % 3 == 0) {
                break;
            }
            System.out.println(i);
        }
        //1, 2
    }
}
