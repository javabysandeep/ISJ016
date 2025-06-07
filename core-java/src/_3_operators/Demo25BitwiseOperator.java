package _3_operators;

public class Demo25BitwiseOperator {
    public static void main(String[] args) {
        //shift the bits of 4 to the right by 1 places
        System.out.println(4 >> 1);//2
        // operand1 / 2^operand2 = 4 / 2^1 ---> 2
        System.out.println(4 >> 2);//1
        System.out.println(4 >> 3);//0
        //4 / 2^3 ---> 4 /8 ---> 0

    }
}
