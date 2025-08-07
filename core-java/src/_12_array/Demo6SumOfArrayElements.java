package _12_array;

public class Demo6SumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];//sum = sum +array[i];
            // sum = sum + i;//wrong
        }
        System.out.println("sum of array elements " + sum);


    }
}
