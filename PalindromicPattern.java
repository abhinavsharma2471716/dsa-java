import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            //spaces
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //first half, backward loop from i to 1
            for(j=i;j>=1;j--){
                System.out.print(j);
            }

            //second half, forward loop from 2 to i
            for(j=2;j<=i;j++){
                System.out.print(j);
            }

            System.out.println();
        }

    }
}

/*
    1
   212
  321123
 43211234
5432112345

 */
