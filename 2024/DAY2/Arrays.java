package DAY2;
import java.util.*;

public class Arrays {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        int[] number= new int[n];
        for(int i =0;i<n;i++){
            number[i] =sc.nextInt();
        }

        for(int i =0;i<n;i++){
            System.out.println(number[i]);
        }
    }
}
