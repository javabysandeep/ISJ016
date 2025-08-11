package _12_array;

public class Demo24Equality {
    public static void main(String[] args) {
        //character arrays
        char[] charArray1 = {'a', 'b', 'c', 'd', 'e', 'f', '1', '2', '@'};
        char[] charArray2 = {'a', 'b', 'c', 'd', 'e', 'f', '1', '2', '@'};
        System.out.println(equals(charArray1, charArray2));

    }

    private static boolean equals(char[] charArray1, char[] charArray2) {
        if (charArray1 == null || charArray2 == null) {
            return false;
        }
        if (charArray1.length != charArray2.length) {
            return false;
        }
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] != charArray2[i]) {
                return false;
            }
        }
        return true;
    }
}
