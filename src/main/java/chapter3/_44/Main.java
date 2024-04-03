package chapter3._44;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 44. برنامهای بنویسید که تعدادی عدد صحیح را از ورودی دریافت و در آرایه ذخیره نماید و سپس یک عدد صحیح از ورودی دریافت و
 * یک عنصر در مکانی با این شماره را حذف نماید.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count of Array :");

        int countArray = input.nextInt();
        Number[] numbers = new Number[countArray];
        for (int i = 0; i < countArray; i++) {
            System.out.println("Enter next int :");
            numbers[i] = input.nextInt();
        }
        System.out.println("Enter Index for delete of element :");
        int indexForDelete = input.nextInt();
        numbers[indexForDelete] = null;
        System.out.println(Arrays.toString(numbers));
    }
}
