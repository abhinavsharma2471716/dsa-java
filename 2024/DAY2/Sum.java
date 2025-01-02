package DAY2;
import java.util.*;
public class Sum {

    public static int calculateSum(int a, int b){
        int sum2; //sum2 variable for calculateSum function
        sum2 = a+b;
        return sum2;
    }

    public static int calculateProduct(int a, int b){
        return a*b;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =calculateSum(a,b); //sum variable for main
        System.out.println("Sum of "+a+" and "+b+" is : "+sum);

        System.out.println("Product of "+a+" and "+b+" is : "+ calculateProduct(a,b));


    }
}
