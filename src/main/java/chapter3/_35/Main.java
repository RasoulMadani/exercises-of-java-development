package chapter3._35;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 35. برنامهای بنویسید که تعدادی عدد صحیح را از ورودی دریافت و در آرایه ذخیره نماید و سپس عناصر آرایه را به صورت معکوس در
 * خروجی نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count of numbers :");
        int countNumbers = input.nextInt();

        int[] numbers = new int[countNumbers];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter Next number :");
            numbers[i] = input.nextInt();
        }
        int[] reverseArray = new int[countNumbers];
        for (int k = 0; k < reverseArray.length; k++) {
            reverseArray[k] = numbers[(reverseArray.length -1) -k];
        }
        System.out.println(Arrays.toString(reverseArray));
    }
}
