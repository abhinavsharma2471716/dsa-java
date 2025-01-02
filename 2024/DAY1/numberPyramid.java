package DAY1;

import java.util.Scanner;

public class numberPyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }

            System.out.println();
        }

    }
}
/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
