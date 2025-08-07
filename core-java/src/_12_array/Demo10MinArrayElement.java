package _12_array;

public class Demo10MinArrayElement {
    public static void main(String[] args) {
        int[] array = {16, 18, 11, 12, 13, 14, 15};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum element is " + min);

    }
}























