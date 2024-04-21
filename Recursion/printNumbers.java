package Recursion;

import java.util.Scanner;

public class printNumbers {

    public static void printNum(int n) {

        if(n==0) return; //base case
        System.out.print(n+" "); // print
        printNum(n-1); //recursion

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
    }
}
