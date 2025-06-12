package _4_controlStatements._3_jump;

public class Demo11 {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("Hello World");
            return;
        }
        //System.out.println("rest of the main");//CTE
    }

   //output : unreachable error : CTE
}
