package _13_string_handling;

public class Demo13Split {
    public static void main(String[] args) {
        String str = "good morning Online people";
        String[] arrayOfStrings = str.split(" ");

        for (String temp : arrayOfStrings) {
            System.out.println(temp);
        }
    }
}
