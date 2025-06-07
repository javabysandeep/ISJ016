package _3_operators;

public class Demo24BitwiseOperator {
    public static void main(String[] args) {
        //shift the bits of 4 to the left by 1 places
        System.out.println(4 << 1);//8
        // operand1 * 2^operand2 = 4 * 2^1 ---> 8
        System.out.println(4 << 2);//16
        System.out.println(4 << 3);//32

    }
}
