package Recursion;

public class factorial {

    public static  int  calculateFact(int n){

        if(n==1 || n== 0){
            return 1;
        }

        int fact_nm1 = calculateFact(n-1);
        int fact = n * fact_nm1;
        return fact;
    }
    public static void main(String[] args) {
        int n=5;
        int fact = calculateFact(n);
        System.out.println(fact);
    }
}
