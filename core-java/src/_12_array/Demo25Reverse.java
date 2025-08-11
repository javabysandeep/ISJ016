package _12_array;

public class Demo25Reverse {
    public static void main(String[] args) {
        //character arrays
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        //good morning
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        //traditional for loop
        System.out.println("printing using traditional for loop");
        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i] + " ");
        }

        //enhanced for loop : used for reading from the array or collection
        System.out.println("\nprinting using enhanced for loop");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }


    }


}
