package chapter3._47;

import java.util.Scanner;

/**
 * برنامهای بنویسید که عناصر دو آرایه دو بعدی با سایز یکسان را از ورودی دریافت و اجزاء آنها را با هم جمع نماید و در خروجی به
 * صورت ماتریس نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Arrays :");
        int size = input.nextInt();
        int[][] array1 = new int[size][size],
                array2 = new int[size][size],
                array3 = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter Elements Of array1: ");
                array1[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.println("Enter Elements Of array2: ");
                array2[i][j] = input.nextInt();
            }
        }
        System.out.println("matrix 1");
        for (int i = 0; i < size; i++) {
            System.out.print("\n");
            for (int j = 0; j < size; j++) {
                System.out.print(array1[i][j] + "\t");
            }
        }

        System.out.println("\n" + "matrix 2");
        for (int i = 0; i < size; i++) {
            System.out.print("\n");
            for (int j = 0; j < size; j++) {
                System.out.print(array2[i][j] + "\t");
            }
        }

        System.out.println("\n" + "matrix 1 + matrix 2");
        for (int i = 0; i < size; i++) {
            System.out.print("\n");
            for (int j = 0; j < size; j++) {
                array3[i][j] = array1[i][j] + array2[i][j];
                System.out.print(array3[i][j] + "\t");
            }
        }
    }
}
