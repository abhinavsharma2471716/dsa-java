package Recursion3;

import java.util.zip.CheckedOutputStream;

public class countMazePath {
    public static int countPaths(int i, int j, int n, int m) {

        if (i == n || j == m){ //no path, as u are outside the boundary
            return 0;
    }
        if(i==n-1 && j==m-1){ // no path from here, stay where you are.
            return 1;
        }
        //move downwards
        int downPaths = countPaths(i+1,j,n,m);
        //move rightwards
        int rightPaths = countPaths(i,j+1,n,m);
        return downPaths+rightPaths;
    }
    public static void main(String[] args) {
        System.out.println(countPaths(0,0,3,3));

    }
}
/*
6
 */