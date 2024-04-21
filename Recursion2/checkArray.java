package Recursion2;

public class checkArray { //strictly increasing

    public static boolean checkArray(int[] arr, int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return checkArray(arr, idx+1);
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,8};
        System.out.println(checkArray(arr,0));
    }
}
