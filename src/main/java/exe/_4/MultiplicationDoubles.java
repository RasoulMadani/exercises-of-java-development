package exe._4;

import java.util.Scanner;

public class MultiplicationDoubles {
    public void multiple(){
        System.out.println("What is your Number1?");

        Scanner scanner = new Scanner(System.in);

        double double1 = scanner.nextDouble();

        System.out.println("What is your Number2?");
        double double2 = scanner.nextDouble();

        System.out.println("What is your Number2?");
        double double3 = scanner.nextDouble();

        System.out.println("multiplications : "  + double1 * double2 * double3);


        /*
        * output :
        *
                What is your Number1?
                2.2
                What is your Number2?
                2.3
                What is your Number2?
                2.4
                multiplications : 12.143999999999998


         */
    }
}
