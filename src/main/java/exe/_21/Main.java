package exe._21;


import java.util.Scanner;

/**
 * برنامه ای بنویسید که سه متغیر از نوع کاراکتر تعریف و به ترتیب از ورودی دریافت نماید و از انتها به ابتدا در خروجی نمایش دهد.
 *
 */
public class Main {
    public static void main(String[] args) {
        char ch1 ;
        char ch2;
        char ch3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Character :");
        ch1 = input.next().charAt(0);
        System.out.println("Enter Second Character :");
        ch2 = input.next().charAt(0);
        System.out.println("Enter Third Character :");
        ch3 = input.next().charAt(0);
        System.out.println("First letter :" + ch1 + "\n" + "Second letter :" +ch2 + "\n"+ "Third letter :" + ch3);
        System.out.println(ch3 + " " + ch2 + " " + ch1);
    }
}
