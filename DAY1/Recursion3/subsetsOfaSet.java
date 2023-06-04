package Recursion3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class subsetsOfaSet {

    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubset( int n, ArrayList<Integer> subset){
        if(n==0){
            printSubset(subset);
            return;
        }

        //add
        subset.add(n);
        findSubset(n-1,subset);

        //not add
        subset.remove(subset.size()-1);
        findSubset(n-1,subset);
    }

    public static void main(String[] args) {
        int n =3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubset(n,subset);
    }
}
/*
3 2 1
3 2
3 1
3
2 1
2
1
 */