package _3_operators;

public class Demo9StringConcatenation {
    public static void main(String[] args) {
        System.out.println(10 + 10);//20
        System.out.println(10 + "10");//1010
        System.out.println(10 + 10 + "10");//2010
        System.out.println('A' + 'A');//130
        System.out.println("A" + "A");//AA
        System.out.println("A" + 'A');//AA// wont be A65
        System.out.println('A' + "A");//AA// wont be 65A
        System.out.println("A" + 'A' + 'A');//AAA
        System.out.println('A' + 'A' + "A");//130A
        System.out.println(10 + 20 + "10" + 10 + 20);//30101020
    }
}
