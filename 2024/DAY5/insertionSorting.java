package DAY5;

import java.util.Scanner;

public class insertionSorting {
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
        //Insertion Sort
        for(int i=1;i< arr.length;i++){
            int current = arr[i];
            int j=i-1; //sorted array index
            while(j>=0 &&  current<arr[j]){
                arr[j+1] =arr[j];
                j--;
            }
            //placement
            //System.out.println(j);
            arr[j+1]=current;
        }

        printArray(arr);

    }
}


