package _13_string_handling;

public class Demo19Conversion {
    public static void main(String[] args) {
        String str1 = "Hello World";
        StringBuilder stringBuilder = new StringBuilder(str1);
        StringBuffer stringBuffer = new StringBuffer(str1);
        String str2 = new String(stringBuilder);
        String str3 = new String(stringBuffer);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

    }
}
