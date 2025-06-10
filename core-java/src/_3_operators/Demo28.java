package _3_operators;

public class Demo28 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println(++a + --a + b++ + ++b + ++c);//13
        System.out.println(10 + 20 * 30 / 10);//70
        System.out.println(10 == 10.0);//true
        System.out.println('a' == 97);//true
        //System.out.println(true == 1);//CTE
        System.out.println(10 + 20 + "30" + 40 + 50);//30304050
        System.out.println(1 + 2 + 3 + "4" + 5 + 6);//6456
        int x = 5;
        System.out.println(x++ + ++x);//5+7--->12
        System.out.println(1 % 10);//1
        System.out.println(1 / 10);//0
        int y = 10;
        double z = 10.5;
        System.out.println(y + z);//20.5
        double pi = 3.1415926688888888888D;
        //int a=b=c=d=100;
    }
}
