package DAY2;
import java.util.*;

public class simpleSearch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int search = sc.nextInt();

        int a[] = new int[n];

        int i;
        for (i=0;i<n;i++){
            a[i] = sc.nextInt();
        }

        for(i=0;i<a.length;i++){
            if(a[i]==search){
                System.out.println(i);
                break;
            }
        }
    }

}
