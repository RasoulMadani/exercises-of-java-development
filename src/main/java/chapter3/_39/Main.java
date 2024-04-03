package chapter3._39;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 39. برنامهای بنویسید که عناصر دو آرایه با طول مساوی را از ورودی دریافت نماید و این دو آرایه را با هم ادغام نماید و به صورت صعودی،
 * مرتب نماید و در خروجی نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter count number in array : ");
        int countArray = input.nextInt();
        int[] array01 = new int[countArray];
        int[] array02 = new int[countArray];
        for (int i = 0; i < countArray; i++) {
            System.out.println("Enter elements of array 01 :");
            array01[i] = input.nextInt();
        }

        for (int i = 0; i < countArray; i++) {
            System.out.println("Enter elements of array 02 :");
            array02[i] = input.nextInt();
        }
        int[] totalArray = new int[countArray * 2];
        System.out.println(Arrays.toString(totalArray));
        int counter = 0;
        for (int i = 0; i < totalArray.length; i++) {
            if (totalArray.length / 2 > i) {
                totalArray[i] = array01[i];
            } else {
                totalArray[i] = array02[counter];
                counter++;
            }
        }
        System.out.println(Arrays.toString(totalArray));
        int[] desArray = new int[totalArray.length];
        for (int i = 0; i < totalArray.length; i++) {
            for (int j = 0; j < totalArray.length; j++) {
                if (i != j) {
                    if(totalArray[i] < totalArray[j]) {
                        int iElement = totalArray[i];
                        int nextElement = totalArray[j];
                        totalArray[i] = nextElement;
                        totalArray[j] = iElement;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(totalArray));
    }
}
