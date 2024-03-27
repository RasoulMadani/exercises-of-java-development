package exe._14;


import java.util.Scanner;

/**
 *4 برنامه ای بنویسید که متغیری از نوع رشته تعریف نماید و سپس با دریافت نام کاربر از ورودی، نام را در ادامه رشته Username"
 *  " :isچاپ نماید.
 *
 */
public class Main {
    public static void main(String[] args) {
        String str = "Username is: ";
        Scanner myObj = new Scanner(System.in);
        String userName;

        // Enter username and press Enter
        System.out.println("Enter username");
        userName = myObj.nextLine();
        System.out.println(str + userName);
    }
}
