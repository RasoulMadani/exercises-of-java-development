package chapter3._41;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 41. برنامهای بنویسید که تعدادی عدد صحیح را از ورودی دریافت و در آرایه ذخیره نماید و سپس بزرگترین و کوچکترین عنصر را در خروجی
 * نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count of Array :");
        int countArray = input.nextInt();
        Number[] numbers = new Number[countArray];
        for (int i = 0; i < countArray; i++) {
            System.out.println("Enter next number :");
            numbers[i] = input.nextInt();
        }

        int max = 0;
        int min = numbers[0].intValue();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].intValue() >= max ){
                max = numbers[i].intValue();
            }else if (numbers[i].intValue() < min){
                min = numbers[i].intValue();
            }
        }
        System.out.println(min+ " --:-- " + max);
    }
}
