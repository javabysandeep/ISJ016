package _13_string_handling;

public class Demo15Reverse {
    public static void main(String[] args) {
        //not a good option to reverse

        String str = "good morning";
        //str.reverse();//reverse method is not present in String class
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        String reversed = new String(chars);
        System.out.println("Reversed String: " + reversed);
    }
}
