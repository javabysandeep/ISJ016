package _13_string_handling;

public class Demo12 {
    public static void main(String[] args) {
        String str = "good morning";
        System.out.println(str.charAt(0));//g
        System.out.println(str.charAt(1)); //o
        System.out.println(str.charAt(2)); //o
        System.out.println(str.charAt(3)); //d

        System.out.println("Reading char by char");
        for (int index = 0; index < str.length(); index++) {
            System.out.print(str.charAt(index));
        }
        System.out.println(str.indexOf("d"));//3
        System.out.println(str.indexOf("good"));//0
    }
}
