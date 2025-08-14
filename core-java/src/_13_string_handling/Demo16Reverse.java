package _13_string_handling;

public class Demo16Reverse {
    public static void main(String[] args) {
        //not a good option to reverse
        String str = "good morning";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

    }
}
