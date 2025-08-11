package _12_array;

public class Demo21ToLowerCase {
    public static void main(String[] args) {
        //character arrays
        char[] charArray = {'A', 'B', 'C', 'D', 'E', 'F'};

        //convert the given array into lowercase
        //range : a to z
        //A : 65 ---> A+32 --> a
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (ch >= 'A' && ch <= 'Z') {
                System.out.print((char) (ch + 32)+
                        " ");
            }
        }
    }
}
