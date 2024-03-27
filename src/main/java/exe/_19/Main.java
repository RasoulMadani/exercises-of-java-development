package exe._19;


import java.text.MessageFormat;
import java.util.Scanner;

/**
 *
 *9 برنامهای بنویسید که متغیر ی با نام d و از نوع double با مقدار عددی 5673.74 و همچنین متغیر دیگری از نوع int با نام i تعریف
 * نماید و با استفاده از تبدیل نوع صریح مقدار متغیر d را در متغیر i قرار داده و در خروجی نمایش دهد
 */
public class Main {
    public static void main(String[] args) {
        double d = 5673.74;
        int i ;
        i = (int) d;
        System.out.println(i);
    }
}
