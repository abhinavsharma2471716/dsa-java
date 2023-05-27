package Recursion;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class sumOfnNumbers {
    public static void printSum(int i, int n, int sum){

        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printSum(i+1,n,sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        printSum(1,5,0);
    }
}
/*
Output:

15 --sum
4 -- after printing sum, return implements, and remaining function goes back until main
3
2
1
 */