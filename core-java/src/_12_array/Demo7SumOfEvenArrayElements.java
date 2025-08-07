package _12_array;

public class Demo7SumOfEvenArrayElements {
    public static void main(String[] args) {
        int[] array = {16, 18, 11, 12, 13, 14, 15};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("sum of even array elements " + sum);


    }
}
