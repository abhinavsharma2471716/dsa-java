package Recursion;
import java.util.*;

import static java.lang.Math.pow;

public class xRaiseTon { //stack height = n
    public static int printxraiseton(int x, int n){
        if(n==0){return 1;}
        if(x==0){return 0;}
        int xpownm1 = printxraiseton(x,n-1);
        int xpown = x * xpownm1;
        return xpown;
    }
    public static void main(String[] args) {
         int x=2, n=5;
         int ans = printxraiseton(x,n);
        System.out.println(ans);
    }
}
