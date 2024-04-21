package DAY5;
import java.util.*;

public class selectionSorting {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();;
        }
        //time complexity = O(n^2)
        //Selection Sort
        for(int i=0;i< arr.length;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest =j;
                }
            }
            //swap
            int temp= arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        printArray(arr);

    }
}

