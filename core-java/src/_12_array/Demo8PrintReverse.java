package _12_array;

public class Demo8PrintReverse {
    public static void main(String[] args) {
        int[] array = {16, 18, 11, 12, 13, 14, 15};

        //print : 15,14,13,12,11,18,16
        for (int i= array.length-1; i>=0 ;i--){
            System.out.print(array[i]+" ");
        }
    }
}
