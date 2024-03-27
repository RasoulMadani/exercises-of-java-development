package exe._18;


import java.text.MessageFormat;
import java.util.Scanner;

/**
 *
 * 8 برنامهای بنویسید که با تعریف متغیرهای مناسب و دریافت شعاع دایره از کاربر )با استفاده از کالس Convert)، محیط آن را محاسبه
 * نماید ودر خروجی نمایش دهد )برای عدد��، ثابتی از نوع اعشار در نظر بگیرید(.
 */
public class Main {
    public static void main(String[] args) {
        final double p = 3.14;
        int radiusOfCircle;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius circle:");
        radiusOfCircle = input.nextInt();
        System.out.println(MessageFormat.format("Radius= {0}\n p= {1}\n perimeterOfTheCircle = {2}",radiusOfCircle,p,p * radiusOfCircle *2));

    }
}
