package Recursion2;

public class movextoend {
    public static String a=""; //new string
    public static int count=0; //count variable
    public static void printString(String str, int idx, int element){
        if(idx==str.length()){
            while(count!=0){
                a=a+'x';
                count--;
            }
            System.out.println(a);
            return;
        } //base case
        if (str.charAt(idx) == 'x') {
            count++;
        }else{
            a=a+str.charAt(idx);
        }
        printString(str,idx+1,element); //recursion


    }
    public static void main(String[] args) {
        printString("axbcxxd", 0,'x');
    }
}
