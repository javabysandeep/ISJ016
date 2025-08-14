package _13_string_handling;

public class Demo18StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello World");
        stringBuffer.append(" there");
        stringBuffer.insert(0, "Hi");
        stringBuffer.delete(3, 6);
        stringBuffer.reverse();
        System.out.println(stringBuffer);

        StringBuffer sb = new StringBuffer("Hello World");
        sb.replace(0, 1, "l");
        System.out.println();

        //StringBuffer sb2 = "literal";
        //StringBuilder sb2 = "literal";

    }
}
