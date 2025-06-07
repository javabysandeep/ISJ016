package _3_operators;

public class Demo20BitwiseOperator {
    public static void main(String[] args) {
        System.out.println(4 & 3);//0
        // 4 ---> 1 0 0
        // 3 ---> 0 1 1
        //---------------
        // 0 <--- 0 0 0
        System.out.println(4 & 5);//4
        // 4 ---> 1 0 0
        // 5 ---> 1 0 1
        //---------------
        // 4 <--- 1 0 0

    }
}
