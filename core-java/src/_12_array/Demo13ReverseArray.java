package _12_array;

public class Demo13ReverseArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 11, 13};
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }

        System.out.println("printing the reversed array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
