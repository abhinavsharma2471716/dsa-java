package DAY1;

import java.util.Scanner;

public class floydsTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        int count=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }

    }
}

