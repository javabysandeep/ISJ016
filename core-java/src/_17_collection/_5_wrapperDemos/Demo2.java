package _17_collection._5_wrapperDemos;

public class Demo2 {
    public static void main(String[] args) {
        byte parseByte = Byte.parseByte("1");
        System.out.println(parseByte);

        short x = Short.parseShort("2");
        System.out.println(x);

        int x1 = Integer.parseInt("123");
        System.out.println(x1);

        boolean aTrue = Boolean.parseBoolean("true");
        System.out.println(aTrue);
    }
}
