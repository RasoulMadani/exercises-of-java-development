package chapter3._43;


import java.util.Arrays;
import java.util.Scanner;

/**
 * برنامه ای بنویسید که تعدادی عدد صحیح را از ورودی دریافت و در آرایه ذخیره نماید و عناصر آرایه را به صورت صعودی مرتب نماید
 * و در خروجی نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count of Array :");
        int countArray = input.nextInt();
        int[] numbers = new int[countArray];
        for (int i = 0; i < countArray; i++) {
            System.out.println("Enter next number :");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    if (numbers[i] < numbers[j]) {
                        int currentNum = numbers[i];
                        int nextNum = numbers[j];
                        System.out.println(currentNum + " ___ " + nextNum + " i: " + i + " j: "  + j);
                        numbers[i] = nextNum;
                        numbers[j] = currentNum;
                        System.out.println(Arrays.toString(numbers));
                    }
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
