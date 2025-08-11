package _12_array;

public class Demo23ContainsDigit {
    public static void main(String[] args) {
        //character arrays
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', '1', '2', '@'};
        boolean containsDigit = false;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= '0' && charArray[i] <= '9') {
                containsDigit = true;
                break;
            }
        }
        System.out.println(containsDigit ? "contains digit" : "does not contains digit");

    }
}
