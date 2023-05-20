import java.util.*;

public class rectanglePattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc .nextInt();
        int i, j;
        for(i=1;i<=rows;i++){
            for(j=1;j<=cols;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

