package _11_object_class_methods;

public class Demo3 {
    public static void main(String[] args) {
        int number = 100;
        // decimal to binary
        System.out.println(Integer.toBinaryString(number));

        //decimal to octal
        System.out.println(Integer.toOctalString(number));

        //decimal to hexadecimal
        System.out.println(Integer.toHexString(number));
    }
}
