package _12_array;

public class Demo9MaxArrayElement {
    public static void main(String[] args) {
        int[] array = {16, 18, 11, 12, 13, 14, 15};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum element is " + max);

    }
}























