package DAY2;
import java.util.*;
public class minAndMax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int a[] = new int[n];

        int i;
        for (i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(i=0;i<a.length;i++){
            if(a[i]<min){
                min = a[i];
            }
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max value is "+max);
        System.out.println("Min value is "+min);
    }

}
