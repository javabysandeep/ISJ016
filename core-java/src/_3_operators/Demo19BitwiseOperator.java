package _3_operators;

public class Demo19BitwiseOperator {
    public static void main(String[] args) {
        System.out.println("************ Bitwise & Operator *************");
        System.out.println(true & true);//true
        System.out.println(false & false);//false
        System.out.println(true & false);//false
        System.out.println(false & true);//false


        System.out.println("************ Bitwise | Operator *************");
        System.out.println(true | true);//true
        System.out.println(false | false);//false
        System.out.println(true | false);//true
        System.out.println(false | true);//true

        System.out.println("************ Bitwise XOR ^ Operator *************");
        System.out.println(true ^ true);//false
        System.out.println(false ^ false);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true

    }
}
