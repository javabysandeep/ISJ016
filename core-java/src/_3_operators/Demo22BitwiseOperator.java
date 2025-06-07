package _3_operators;

public class Demo22BitwiseOperator {
    public static void main(String[] args) {
        System.out.println(4 ^ 3);//7
        // 4 ---> 1 0 0
        // 3 ---> 0 1 1
        //---------------
        // 7 <--- 1 1 1
        System.out.println(4 ^ 5);//1
        // 4 ---> 1 0 0
        // 5 ---> 1 0 1
        //---------------
        // 1 <--- 0 0 1

    }
}
