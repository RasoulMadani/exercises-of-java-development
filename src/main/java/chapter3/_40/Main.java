package chapter3._40;


import java.util.Scanner;

/**
 * 40. برنامهای بنویسید که تعدادی عدد صحیح را از ورودی دریافت و در آرایه ذخیره نماید و سپس تعداد تکرار هر عنصر را در خروجی
 * نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your count array number :");
        int countArray = input.nextInt();
        int[] numbers = new int[countArray];
        for (int i = 0; i < countArray; i++) {
            System.out.println("Enter next number :");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count > 0) {
                count++;
                System.out.println("duplicated number is : " + numbers[i] + " ==> " + count);
            }else {
                count++;
                System.out.println("duplicated number is : " + numbers[i] + " ==> " + count);
            }
        }
    }
}
