package _13_string_handling;

public class Demo2 {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = "abc";
        String str4 = "xyz";
        String str5 = "xyz";

        System.out.println(str1);//abc ---> toString method is overridden in returns the content and not the hashCode
        System.out.println(str2);//abc
        System.out.println(str3);//abc
        System.out.println(str4);//xyz
        System.out.println(str5);//xyz

    }
}
