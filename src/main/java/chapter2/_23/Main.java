package chapter2._23;


import java.util.Scanner;

/**
 *23. برنامهای بنویسید که دو متغیر از نوع رشته و با مقادیر Hello و World تعریف کرده و با استفاده از عملگر +، این دو رشته را در کنار
 * هم قرار داده و در خروجی به درستی نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String message = str1 + " " + str2 ;
        System.out.println(message);
    }
}
