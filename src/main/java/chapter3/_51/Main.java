package chapter3._51;

import java.util.Scanner;

/**
 * برنامه ای بنویسید که عناصر یک آرایه را از ورودی دریافت و مجموع عناصر هر سطر و هر ستون را در خروجی نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Matrix :");
        int sizeMatrix = input.nextInt();

        int[][] matrix = new int[sizeMatrix][sizeMatrix];

        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        String sum2Str = "\n";
        for (int i = 0; i < sizeMatrix; i++) {
            int sum = 0;
            System.out.println();
            for (int j = 0; j < sizeMatrix; j++) {
                System.out.print(matrix[i][j] + "\t");
                sum+= matrix[i][j];
            }
            System.out.print(sum);
            int sum2 = 0;

            for (int j = 0; j < sizeMatrix; j++) {
                sum2+= matrix[j][i];
            }
            sum2Str += sum2 + "\t";
        }
        System.out.println( sum2Str);
    }
}
