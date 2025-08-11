package _12_array;

public class Demo22ToUpperCase {
    public static void main(String[] args) {
        //character arrays
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};

        //convert the given array into uppercase
        //range : a to z
        //A : 65 ---> A+32 --> a
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (ch >= 'a' && ch <= 'z') {
                System.out.print((char) (ch - 32) +
                        " ");
            }
        }
    }
}
