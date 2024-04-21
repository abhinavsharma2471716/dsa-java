package DAY2;
import java.util.*;

public class spiralMatrix2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols =sc.nextInt();

        int[][] a= new int[rows][cols];

        int i,j;

        //Input
        //rows
        for(i=0;i< rows;i++){
            //cols
            for(j=0;j<cols;j++){
                a[i][j] = sc.nextInt();
            }
        }

        int rows_start = 0;
        int rows_end = rows-1;
        int cols_start = 0;
        int cols_end = cols-1;

        while(rows_start <= rows_end && cols_start <= cols_end)
        {
            //1
            for(int col= cols_start;col<=cols_end;col++){
                System.out.print(a[rows_start][col]+" ");
            }
            rows_start++;

            //2
            for(int row =rows_start;row <= rows_end;row++){
                System.out.print(a[row][cols_end]+" ");
            }
            cols_end--;

            //3
            for(int col=cols_end;col>=cols_start;col--){
                System.out.print(a[rows_end][col]+" ");
            }
            rows_end--;

            //4
            for(int row= rows_end;row>=rows_start;row--){
                System.out.print(a[row][cols_start]+" ");
            }
            cols_start++;

        }

    }
}

/*
input
6
5
1 2 3 4 5
18 19 20 21 6
17 28 29 22 7
16 27 30 23 8
15 26 25 24 9
14 13 12 11 10
Output:
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30
Process finished with exit code 0

 */