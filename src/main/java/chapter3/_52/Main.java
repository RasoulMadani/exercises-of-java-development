package chapter3._52;

import java.util.Arrays;
import java.util.Scanner;

/**
 *  برنامه ای بنویسید که عناصر آرایه دو بعدی مربعی، را از ورودی دریافت و ماتریس بالا مثلثی آن را در خروجی نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = getElementsMatrix();
        printMatrix(matrix);
        triangularTopGenerator(matrix);
        printMatrix(matrix);
    }
    public static int[][] getElementsMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Matrix :");
        int sizeMatrix = input.nextInt();
        int[][] matrix = new int[sizeMatrix][sizeMatrix];

        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                System.out.println("Enter next Element of Matrix :");
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
    public  static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.println("\n");
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
        }
    }
    public static int[][] triangularTopGenerator(int[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j){
                    for (int e = i+1; e < matrix[0].length; e++) {
                        matrix[e][i] = 0;
                    }
                }
            }
        }
        return matrix;
    }
}
