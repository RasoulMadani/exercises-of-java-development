package chapter3._49;

import java.util.Scanner;

/**
 * .49برنامه ای بنویسید که عناصر آرایه دو بعدی مربعی، را از ورودی دریافت و ترانهاده آن را در خروجی نمایش دهد (ترانهاده یک ماتریس،
 * ماتریسی می باشد که در آن، نسبت به ماتریس اولیه، جای سطرها و ستون ها با هم عوض شده باشد. یعنی عناصر سطر اول به جای
 * عناصر ستون اول و عناصر ستون اول نیز به جای عناصر سطر اول قرار گیرند و عناصر سایر سطرها و ستون ها نیز به همین شکل
 * جایشان با یکدیگر عوض شود)
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Matrix");
        int sizeMatrix = input.nextInt();

        int[][] matrix = new int[sizeMatrix][sizeMatrix],
                matrix2=  new int[sizeMatrix][sizeMatrix];

        for (int i = 0; i < sizeMatrix; i++) {
            for (int j = 0; j < sizeMatrix; j++) {
                System.out.println("Enter Next Element of Matrix :");
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < sizeMatrix; i++) {
            System.out.println();
            for (int j = 0; j < sizeMatrix; j++) {
                matrix2[i][j] = matrix[j][i];
                System.out.print(matrix2[i][j] + "\t");
            }
        }

    }
}
