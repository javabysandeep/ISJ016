package _13_string_handling;

public class Demo11Replace {
    public static void main(String[] args) {
        String s1 = "aaabbbbcccddddaaa";
        s1 = s1.replace("a", "A");
        System.out.println(s1);//AAAbbbbcccddddAAA

        System.out.println(s1.startsWith("X"));//false
        System.out.println(s1.endsWith("a"));//false

        System.out.println(s1.startsWith("a".toUpperCase()));//true
    }
}
