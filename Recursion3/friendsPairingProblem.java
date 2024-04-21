package Recursion3;

public class friendsPairingProblem {
    public static int printWays(int n){
        if(n<=1){
            return 1;
        }


        //single
       int single =  printWays(n-1);

        //pair

        int pair = printWays(n-2)*(n-1);

        return single + pair;
    }
    public static void main(String[] args) {
        int n= 3;
        int ans = printWays(n);
        System.out.println(ans);
    }
}

/*
let's say  abc:
a b c
ab c
ac b
a bc
 */