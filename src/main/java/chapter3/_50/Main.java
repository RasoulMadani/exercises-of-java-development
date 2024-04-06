package chapter3._50;

import java.util.Scanner;

/**
 * برنامهای بنویسید که عناصر آرایه دو بعدی مربعی، را از ورودی دریافت و مجموع عناصر قطر سمت راست آن را در خروجی نمایش
 * دهد
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Matrix :");
        int sizeMatrix = input.nextInt();
        int[][] array = new int[sizeMatrix][sizeMatrix];

        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                System.out.println("Enter next Element Of matrix :");
                array[i][j] = input.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                if(i == j) {
                   sum += array[i][j];
                }
            }
        }
        System.out.println("\n Sum is :" + sum);
    }
}
