package DAY2;
import java.util.*;

public class Factorial {
    public static void factorial(int n){
        int i;
        int fact;
        fact = 1;
        if(n<0){
            System.out.println("Factorial of negative number is not possible");
            return;
        }
        for(i=n;i>=1;i--) {
            fact *= i;
        }
            System.out.println(fact);


    }


    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorial(n);


    }
}

