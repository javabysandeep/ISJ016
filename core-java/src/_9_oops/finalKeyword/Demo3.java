package _9_oops.finalKeyword;

public class Demo3 {
    public static void main(String[] args) {
        final int variable = 100;
        //variable = 200; //CTE ---> reassignment not possible
        System.out.println(variable);
    }
}
