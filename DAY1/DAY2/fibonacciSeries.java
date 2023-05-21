package DAY2;
import java.util.*;

public class fibonacciSeries {
    public static void fibonacci(int n){
        int first_number = 0;
        int second_number = 1;
        /* working fine as well
        int no =0;
        int i;
        if(n<1) {System.out.print("Enter number from 1 to n"); return;}
        else if(n==1) { System.out.print(first_number); return;}
        else if(n==2) { System.out.print(first_number+ " "+ second_number); return;}
        else
        if(n>2){
            System.out.print(first_number+ " ");
            System.out.print(second_number+ " ");
            for(i=1;i<n-1;i++){
                no = first_number + second_number;
                System.out.print(no+" ");
                first_number = second_number;
                second_number = no;
            }

        }*/
        System.out.print(first_number+" ");
        if(n>1){
            for(int i=2;i<=n;i++){
                System.out.print(second_number+" "); // 1 1 2 3
                int temp = second_number; // 1 1 2 3
                second_number = first_number+second_number; //1 2 3 5
                first_number = temp; //1 1 2 3

            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);

    }
}
