package chapter3._37;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 37. برنامهای بنویسید که تعدادی عدد صحیح را از ورودی دریافت و در آرایه ذخیره نماید و سپس عناصر این آرایه را در آرایه ای دیگر ذخیره
 * نماید.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count of Numbers :");
        int countNumbers = input.nextInt();

        int[] numbers = new int[countNumbers];

        for (int i = 0; i < countNumbers; i++) {
            numbers[i] = input.nextInt();
        }
        int[] newArray = numbers.clone();

        System.out.println(Arrays.toString(newArray));
    }
}
