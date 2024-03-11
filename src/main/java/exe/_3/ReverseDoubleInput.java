package exe._3;

import java.util.Scanner;

public class ReverseDoubleInput {
    public void reverser(){
        System.out.println("What is your Number1?");

        Scanner scanner = new Scanner(System.in);

        double name = scanner.nextDouble();

        System.out.println("What is your Number2?");
        double name1 = scanner.nextDouble();


        System.out.println(name1 + " first number ");
        System.out.println(name + " second number ");


        /*
        * output :
        *
                What is your Number1?
                12.1
                What is your Number2?
                12.3
                12.3 first number
                12.1 second number

         */
    }
}
