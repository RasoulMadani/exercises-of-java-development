package chapter3._42;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 42. برنامه ای بنویسید که تعدادی عدد صحیح را از ورودی دریافت و در آرایه ذخیره نماید و سپس عناصر زوج و فرد را در دو آرایه جدا از
 * هم ذخیره نماید و در خروجی نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count of Array numbers :");
        int countArray = input.nextInt();
        int[] numbers = new int[countArray];
        for (int i = 0; i < countArray; i++) {
            numbers[i] = input.nextInt();
        }
        Number[] oddNumbers = new Number[countArray];
        Number[] evenNumbers = new Number[countArray];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers[i] = numbers[i];
            }else {
                oddNumbers[i] = numbers[i];
            }
        }
        System.out.println("odd Numbers :" + Arrays.toString(oddNumbers));

        System.out.println("event Numbers :" + Arrays.toString(evenNumbers));
    }
}
