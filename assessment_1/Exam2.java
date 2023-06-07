package assessment_1;

import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {

        System.out.print("높이를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 높이를 입력해주세요 : 3                // 출력
        f1(n);
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
