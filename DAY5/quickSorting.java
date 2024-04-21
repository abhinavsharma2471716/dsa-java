package DAY5;

public class quickSorting {
    public static  int partition( int arr[], int low, int high){
        System.out.println("Entering Partition:" +"low is "+low+" high is "+high+" pivot is: "+arr[high]);
        int pivot = arr[high];
        int i =low-1;
        for(int j =low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                System.out.println("Swap inside");
                //swap
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        System.out.println("Outside for loop");
        i++;
        int temp = arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        System.out.println("Value of i is "+i);
        return i;

    }

    public static void quicksort(int arr[], int low, int high)
    {
        if(low< high) {
            System.out.println("Entering Quicksort");
            int pi = partition(arr, low, high);
            System.out.println("First call: pi is "+pi+" , low is "+low+" ,high is "+(pi-1));
            quicksort(arr, low, pi - 1);
            System.out.println("Second call: pi is "+(pi+1)+" , low is "+(pi+1)+" ,high is "+high);
            quicksort(arr, pi + 1, high);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,3,7,8,4};
        int n = arr.length;
        quicksort(arr, 0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

/*
Entering Quicksort
Entering Partition:low is 0 high is 4 pivot is: 4
Swap inside
Outside for loop
Value of i is 1
First call: pi is 1 , low is 0 ,high is 0
Second call: pi is 2 , low is 2 ,high is 4
Entering Quicksort
Entering Partition:low is 2 high is 4 pivot is: 5
Outside for loop
Value of i is 2
First call: pi is 2 , low is 2 ,high is 1
Second call: pi is 3 , low is 3 ,high is 4
Entering Quicksort
Entering Partition:low is 3 high is 4 pivot is: 7
Outside for loop
Value of i is 3
First call: pi is 3 , low is 3 ,high is 2
Second call: pi is 4 , low is 4 ,high is 4
3 4 5 7 8
 */