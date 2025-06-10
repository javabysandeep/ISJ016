package _4_controlStatements.conditional;

public class Demo12SwitchUpdate {
    public static void main(String[] args) {
        int value = 6;
        switch (value) {
            case 1 -> System.out.println("Jan");
            case 2 -> System.out.println("Feb");
            case 3 -> System.out.println("Mar");
            case 4 -> System.out.println("Apr");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("Jun");
            case 7 -> System.out.println("Jul");
            case 8 -> System.out.println("Aug");
            case 9 -> System.out.println("Sep");
            case 10 -> System.out.println("Oct");
            case 11 -> System.out.println("Nov");
            case 12 -> System.out.println("Dec");
            default -> System.out.println("Invalid month");
        }
        //Mar

    }
}
