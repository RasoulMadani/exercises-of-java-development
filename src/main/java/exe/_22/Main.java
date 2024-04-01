package exe._22;


import java.util.Scanner;

/**
 *22. برنامهای بنویسید که شعاع کره را دریافت و با استفاده از آن، مساحت و حجم کره را محاسبه نماید و در خروجی نمایش دهد.
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle :");
        int ballRadius = input.nextInt();
        double areaBall = ballRadius * ballRadius * 3.14 * 4;
        double volumeBall = ballRadius * ballRadius * ballRadius * 3.14 * (4/3);
        System.out.println("Radius :" + ballRadius + "\n" + "areaBall :" + areaBall + "\n" + "volumeBall :" + volumeBall );
    }
}
