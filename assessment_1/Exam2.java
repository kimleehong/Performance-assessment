package assessment_1;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("높이를 입력해주세요 : ");
            int n = sc.nextInt();
            f1(n);
        }

        // 높이를 입력해주세요 : 3                // 출력

        /*

         *

         ***

         *****

         */

        // 높이를 입력해주세요 : 5
        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         */

        // 높이를 입력해주세요 : 7
        // 출력

        /*

         *

         ***

         *****

         *******

         *********

         ***********

         *************

         */


    }

    public static void f1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
