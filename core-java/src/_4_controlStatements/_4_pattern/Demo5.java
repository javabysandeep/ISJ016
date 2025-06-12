package _4_controlStatements._4_pattern;

public class Demo5 {
    public static void main(String[] args) {
        /*

         1
         2 2
         3 3 3
         4 4 4 4
         5 5 5 5 5

         */

       for(int row = 1; row <= 5; row++) {
           for(int col = 1; col <= row; col++) {
               System.out.print(row+" ");
           }
           System.out.println();
       }
    }
}
