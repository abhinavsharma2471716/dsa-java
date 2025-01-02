package DAY1;

import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            //spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //first half, stars - 2*i-1
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
        for (i = n; i >= 1; i--) {
            //spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //second half, stars - 2*i-1
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }


            System.out.println();
        }


    }
}

/*
 *
 ***
 *****
 *******
 *******
 *****
 ***
 *
 */
