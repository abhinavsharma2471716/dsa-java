import java.sql.SQLOutput;
import java.util.Scanner;

public class hollowRhombus {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                if(j==1 || j==n || i==1 ||i==n) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
/*
    *****
   *   *
  *   *
 *   *
*****
 */