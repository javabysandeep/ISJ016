package _13_string_handling;

public class Demo4Equals {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = "abc";
        String s4 = "abc";
        System.out.println(10==10);//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//true
        System.out.println(s2.equals(s3));//true
        System.out.println(s2.equals(s4));//true
        System.out.println(s3 .equals(s4));//true
    }
}
