package _12_array;

public class Demo4 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        //array is a reference variable
        System.out.println(array);//[I@6acbcfc0
        System.out.println(array[0]);//10
        System.out.println(array[1]);//20
        System.out.println(array[2]);//30
        System.out.println(array[3]);//40
        System.out.println(array[4]);//50
        System.out.println(array[5]);//RTE :: ArrayIndexOutOfBoundsException
    }
}
