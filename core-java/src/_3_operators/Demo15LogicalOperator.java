package _3_operators;

public class Demo15LogicalOperator {
    public static void main(String[] args) {
        System.out.println("************ Logical && Operator *************");
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(true && false);//false
        System.out.println(false && true);//false

        //System.out.println(10 && 3);//CTE

        System.out.println("************ Logical || Operator *************");
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        System.out.println(false || true);//true

        System.out.println("************ Logical NOT Operator *************");
        System.out.println(!true);//false
        System.out.println(!false);//true

    }
}
