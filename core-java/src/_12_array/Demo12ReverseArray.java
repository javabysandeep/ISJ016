package _12_array;

public class Demo12ReverseArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 11, 13};
        //wrong way 01: printing in reverse order
        System.out.println("wrong way 01: printing in reverse order");
        for (int index = array.length - 1; index >= 0; index--) {
            System.out.print(array[index] + " ");
        }

        // way 02 : using another array which is not efficient
        //waste of memory and time
        int[] reversedArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[i] = array[i];
        }



        System.out.println("\nprinting the reversed array");
        for (int index = 0; index > reversedArray.length; index++) {
            System.out.print(reversedArray[index] + " ");
        }

        //way 03 : using single pass without any other array

    }
}
