package Recursion3;

public class tilingProblem {
    public static int placeTiles(int n, int m){

        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //vertically
        int vertical =  placeTiles(n-m,m);
        //horizontally
        int horizontal = placeTiles(n-1,m);

        return vertical +horizontal;
    }
    public static void main(String[] args) {
        int n=4;
        int m=2;
        int ans = placeTiles(n,m);
        System.out.println(ans);
    }
}
/*
5
 */