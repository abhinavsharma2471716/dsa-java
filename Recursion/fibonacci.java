package Recursion;

public class fibonacci {
    public static void printFibo(int firstnumber, int secondnnumber, int end){

        if(end==0){
            return;
        }

        int nextnumber = firstnumber+secondnnumber;
        System.out.println(nextnumber);
        printFibo(secondnnumber, nextnumber, end-1);
    }
    public static void main(String[] args) {
        int end =7;
        int firstnumber =0;
        System.out.println(firstnumber);
        int secondnumber =1;
        System.out.println(secondnumber);
        printFibo(firstnumber, secondnumber, end-2);//since we already print 0 and 1 in main
    }
}
