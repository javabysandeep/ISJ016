package _12_array;

public class Demo11SecondMax {
    public static void main(String[] args) {
        int[] array = {88, 56, 67, 70, 91, 79, 90};
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            }
            if (array[i] < max && array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        System.out.println("maximum element is " + max); //91
        System.out.println("second maximum element is " + secondMax);//90
    }
}
