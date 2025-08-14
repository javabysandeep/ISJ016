package _13_string_handling;

public class Demo10Substring {
    public static void main(String[] args) {
        String str = "good morning. its 14th august 2025";
        String str2 = str.substring(0,5);
        String str3 = str.substring(0);
        String str4 = str.substring(5);
        String str5 = str.substring(-5);//StringIndexOutOfBoundsException
        System.out.println(str);//good morning. its 14th august 2025
        System.out.println(str2);//good
        System.out.println(str3);//good morning. its 14th august 2025
        System.out.println(str4);//morning. its 14th august 2025


    }
}
