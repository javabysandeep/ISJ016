package _3_operators;

public class Demo29 {
    public static void main(String[] args) {
        int x;//declaration
        x = 100; //initialization : assigning value to the variable for the first time
        int y = 200; //initialization + declaration

        //int a=b=c=d=100;//CTE
        int a = 1;
        int b = 2;
        int c = 3;
        //System.out.println(a=b=c=100=200);//CTE
        System.out.println(a = b = c = 200);//200
        //System.out.println(a = b = c == 200==100);//CTE
        System.out.println('A' % 2 == 0);//false
        //System.out.println(true & 4);//CTE
        System.out.println(3 & 4);//0
        //3 ---> 0 1 1
        //4 ---> 1 0 0
        //0<---- 0 0 0
        System.out.println(5 << 3);//5 * 2^3 ---> 40
        // 5 --> 0 0000 101
        //101000 ==>1*2^5 + 0 * 2^4 + 1 * 2^3 + 0 * 2^2 + 0 * 2^1 + 0 * 2^0 ---> 40
        //123 = 1 * 10^2 + 2 * 2 ^1 + 3 * 2^0 = 100 + 20 + 3
    }
}
