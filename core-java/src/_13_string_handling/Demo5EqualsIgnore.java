package _13_string_handling;

public class Demo5EqualsIgnore {
    public static void main(String[] args) {
        String s1 = new String("Abc");
        String s2 = new String("abc");
        String s3 = "abC";
        String s4 = "abC";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equalsIgnoreCase(s2));//true

    }
}
