package _4_controlStatements._4_pattern;

public class Demo7 {
    public static void main(String[] args) {
        /*

                *
              * *
            * * *
          * * * *
        * * * * *

         */
        for (int row = 1; row <= 5; row++) {
            //spaces
            for (int space=5-row; space >= 0; space--) {
                System.out.print(" ");
            }
            //stars
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
