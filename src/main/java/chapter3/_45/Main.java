package chapter3._45;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 45. برنامهای بنویسید که تعدادی عدد صحیح را از ورودی دریافت و در آرایه ذخیره نماید و سپس دومین عدد بزرگتر در آرایه را در خروجی
 * نمایش دهد.
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
        int max = 0; // 40 30 20;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].intValue() > max) {
                max = numbers[i].intValue();
            }
        }
        int different = 0;
        boolean flag = true;
        int secondNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i].intValue() != max){
                if(flag){
                    different = max - numbers[i].intValue();
                    flag = false;
                }
                int differentWithMax = max - numbers[i].intValue();
                if (differentWithMax <= different){
                    different = differentWithMax;
                    secondNumber = numbers[i].intValue();
                }
            }
        }
        System.out.println(max + " --- " +secondNumber +" --- " +different);
    }
}
