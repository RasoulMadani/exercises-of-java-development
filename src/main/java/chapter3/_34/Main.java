package chapter3._34;


import java.util.Arrays;
import java.util.Scanner;

/**
 * برنامه ای بنویسید که 10 عدد صحیح، از ورودی دریافت و در آرایه ذخیره نماید و در خروجی نمایش دهد.
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Next number:");
        int[] numbers = new int[10];
        int counter = 0;
        while (counter<10){
            numbers[counter] = input.nextInt();
            counter++;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
