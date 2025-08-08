package _12_array;

public class Demo14PalindromeArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 20, 10};
        int left = 0, right = array.length - 1;
        boolean isPalindrome = true;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            if (array[left] != array[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println("\nprinting the reversed array");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(isPalindrome ? "Its an palindrome" : "Its not an palindrome");

    }
}
