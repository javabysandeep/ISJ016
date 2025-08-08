package _12_array;

public class Demo15TwoArrayEquality {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 18};
        //int[] array2 = null;
        //int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8};
        // boolean[] array2 = {true, false, true, false};
//        System.out.println(array1.length);//10
        // System.out.println(array2.length);//RTE : NullPointerException
        System.out.println(equals(array1, array2));
    }

    public static boolean equals(int[] array1, int[] array2) {
        //check 01 : null
        if (array1 == null || array2 == null) {
            return false;
        }

        //check 02 : length
        if (array1.length != array2.length) {
            return false;
        }
        //check 03 : type

        //check 04 : content check
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
