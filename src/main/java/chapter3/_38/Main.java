package chapter3._38;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 38. برنامهای بنویسید که تعدادی عدد صحیح را از ورودی دریافت و در آرایه ذخیره نماید و سپس عناصر این آرایه را به صورت غیر تکراری
 * در خروجی نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of integers :");
        int countNumbers = input.nextInt();
        int[] numbers = new int[countNumbers];

        for (int i = 0; i < countNumbers; i++) {
            System.out.println("Enter number:");
            numbers[i] = input.nextInt();
        }
        int[] arrayNotDuplicated = new int[countNumbers];
        for (int i = 0; i < countNumbers; i++) { //3,3,2,2
            for (int j = 0; j < countNumbers; j++) {
                if (i != j) {

                    if (numbers[i] == numbers[j]) {
//                        System.out.println(i + " " + j + numbers[i] + numbers[j]);
                        int counter = 0;
                        for (int k = 0; k < arrayNotDuplicated.length; k++) {
                            // [0,0,0]
                            if (arrayNotDuplicated[k] == numbers[j]) {
                                System.out.println(" != ");
                                counter++;
//                                System.out.println("arrayNot "+arrayNotDuplicated[i] +"numbersNot " + numbers[i]);
                            }

                            if (k == arrayNotDuplicated.length - 1 && counter == 0) {

                                System.out.println(" == ");
                                arrayNotDuplicated[i] = numbers[j];

                            }
                        }

                    }
                }
            }
        }
        int[] differentArray = new int[countNumbers];

        for (int i = 0; i < countNumbers; i++) {
            int counter = 0;
            for (int j = 0; j < countNumbers; j++) {
                if (numbers[i] != arrayNotDuplicated[j]) {
                    System.out.println("!=" + numbers[i]);
                    counter++;
                }
            }
            if (counter == numbers.length) {
                System.out.println("counter " + counter);
                differentArray[i] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(differentArray));
        System.out.println(Arrays.toString(arrayNotDuplicated));
        for (int i = 0; i < countNumbers; i++) {
            if (differentArray[i] == 0){
                continue;
            }
            for (int j = 0; j < countNumbers; j++) {
                if (arrayNotDuplicated[j] == 0){
                    arrayNotDuplicated[j] = differentArray[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arrayNotDuplicated));
    }
}
