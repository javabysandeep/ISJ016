package _3_operators;

public class Demo27ConditionalOperatorLeapYear {
    public static void main(String[] args) {
        int year = 2025;
        System.out.println(
                year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
                        ? "leap year" : "not a leap year");

    }
}
