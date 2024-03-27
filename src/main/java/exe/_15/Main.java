package exe._15;


import java.util.Scanner;

/**
 * 5 برنامه ای بنویسید که ابتدا متغیری از نوع عددی تعریف نماید و سن کاربر را از ورودی دریافت و در این متغیر قرار دهد و سپس این
 * عدد را در ادامه رشته " :is age Your "چاپ نماید.
 */
public class Main {
    public static void main(String[] args) {
        int age;
        Scanner myObj = new Scanner(System.in);

        // Enter username and press Enter
        System.out.println("Enter age");
        age = myObj.nextInt();
        System.out.println("Your age is : " + age);
    }
}
