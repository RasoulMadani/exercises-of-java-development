package exe._17;


import java.text.MessageFormat;

/**
 *
 * 7 برنامهای بنویسید که دو متغیر از نوع short و int با مقادیر عددی 10 و 20 تعریف نموده و حاصل جمع این دو عدد را در متغیری از
 * نوع double قرار داده و هر سه عدد را در خروجی نمایش دهد.
 */
public class Main {
    public static void main(String[] args) {
        short numberShort = 1;
        int numberInt = 2;
        double sum = numberInt + numberShort;

        System.out.println(
                MessageFormat.format("a = \"{0}\"\n, b = \"{1}\"\n, a+b = \"{2}\" ", numberInt, numberShort,sum)
        );
    }
}
