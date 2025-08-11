package _12_array;

import java.util.Scanner;

public class Demo20Addition {
    public static void main(String[] args) {
        //addition of two equal length matrices
        //01. accept the matrix
        int[][] matrix1 = acceptMatrix();
        int[][] matrix2 = acceptMatrix();
        int[][] result = addMatrices(matrix1, matrix2);
        printMatrix(result);

    }

    private static void printMatrix(int[][] result) {
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    private static int[][] acceptMatrix() {
        System.out.println("Enter the number of rows and columns");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        return matrix;
    }

}
