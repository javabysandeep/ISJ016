package _13_string_handling;

public class Demo17StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello World");
        System.out.println(10/0);
        stringBuilder.append(" there");
        stringBuilder.insert(0,"Hi");
        stringBuilder.delete(3,6);
        stringBuilder.reverse();
        System.out.println(stringBuilder);


    }
}
