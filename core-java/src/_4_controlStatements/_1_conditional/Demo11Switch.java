package _4_controlStatements._1_conditional;

public class Demo11Switch {
    public static void main(String[] args) {
        int value = 3;
        switch (value){
            case 1 :  System.out.println("Jan");
            case 2 :  System.out.println("Feb");
            case 3 :  System.out.println("Mar");
            case 4 :  System.out.println("Apr");
            case 5 :  System.out.println("May");
            case 6 :  System.out.println("Jun");break;
            case 7 :  System.out.println("Jul");break;
            case 8 :  System.out.println("Aug");break;
            case 9 :  System.out.println("Sep");
            case 10 :  System.out.println("Oct");break;
            case 11 :  System.out.println("Nov");break;
            case 12 :  System.out.println("Dec");break;
            default: System.out.println("Invalid month");break;
        }
        //Mar, Apr, May, Jun

    }
}
