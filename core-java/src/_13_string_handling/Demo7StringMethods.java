package _13_string_handling;

public class Demo7StringMethods {
    public static void main(String[] args) {
        String str = "IT Shaala";
        System.out.println("String length: " + str.length());

        String str2 = "           IT Shaala          ";
        //remove the leading and trailing spaces ---> trim
        str2 = str2.trim();
        System.out.println(str2);//IT Shaala
        System.out.println("string length after trim "+str2.length());
    }
}
