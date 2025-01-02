package Recursion2;

public class reverseString {
    public static void reverse(String str, int n){
        if(n==0){
            System.out.print(str.charAt(0));
            return;
        }
        System.out.print(str.charAt(n));
        reverse(str,n-1);

    }
    public static void main(String[] args) {
        String str="Abhinav";
        reverse(str,str.length()-1);
    }
}
