package chapter3._48;

import java.util.Scanner;

/**
 * 48. برنامهای بنویسید که عناصر دو آرایه دو بعدی مربعی، با سایز یکسان را از ورودی دریافت و اجزاء آن ها را در یکدیگر ضرب نماید و در
 * خروجی به صورت ماتریس نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of matrix :");
        int sizeOfMatrix = input.nextInt();

        int[][] matrix1 = new int[sizeOfMatrix][sizeOfMatrix],
                matrix2 = new int[sizeOfMatrix][sizeOfMatrix],
                matrix3 = new int[sizeOfMatrix][sizeOfMatrix];

        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                System.out.println("Enter next Element of Matrix 1");
                matrix1[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < sizeOfMatrix; i++) {
            for (int j = 0; j < sizeOfMatrix; j++) {
                System.out.println("Enter next Element of Matrix 2");
                matrix2[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix1 * matrix2");
        for (int i = 0; i < sizeOfMatrix; i++) {
            System.out.print("\n");
            for (int j = 0; j < sizeOfMatrix; j++) {
                matrix3[i][j] = matrix1[i][j] * matrix2[i][j];
                System.out.print(matrix3[i][j] + "\t");
            }
        }
    }
}
