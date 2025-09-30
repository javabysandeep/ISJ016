package _17_collection._5_wrapperDemos;

public class Demo3 {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(123);//converts primitive to object format
        System.out.println(Integer.toBinaryString(123));// convert int to binary
        System.out.println(Integer.toOctalString(123));// convert int to octal
        System.out.println(Integer.toHexString(123));//convert int to hex
    }
}
