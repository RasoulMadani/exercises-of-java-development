package chapter3._36;


import java.util.Arrays;
import java.util.Scanner;

/**
 * برنامهای بنویسید که تعدادی عدد صحیح را از ورودی دریافت و در آرایه ذخیره نماید و سپس مجموع عناصر آرایه را در خروجی نمایش
 * دهد.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count number :");
        int countNumbers = input.nextInt();
        int[] numbers = new int[countNumbers];
        int totalNumbers = 0;
        int newNumber;
        for (int i = 0; i < countNumbers; i++) {
            newNumber = input.nextInt();
            numbers[i] = newNumber;
            totalNumbers += newNumber;
        }
        System.out.println("Total number :" + totalNumbers);
    }
}
