package chapter3._46;

import java.util.Arrays;
import java.util.Scanner;

/**
 * برنامهای بنویسید که آرایه دو بعدی 3x3 تعریف نماید و عناصر آن را از ورودی دریافت و در خروجی نمایش دهد.
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array1 = new int[3][3];

        for (int i = 0; i < array1[0].length; i++) {
            for (int j = 0; j < array1[1].length; j++) {
                System.out.println("Enter Next int :");
                array1[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < array1[0].length; i++) {
            System.out.print("\n");
            for (int j = 0; j < array1[1].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
        }
    }
}
