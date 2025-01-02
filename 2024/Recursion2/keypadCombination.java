package Recursion2;

public class keypadCombination {
    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printKeypadSubsequence( int idx, String combination, String number){
        if(idx==number.length()){
            System.out.println(combination);
            return;
        }

            for(int i=0;i<keypad[number.charAt(idx)-'0'].length();i++){
                char curchar = keypad[number.charAt(idx)-'0'].charAt(i);
                System.out.println("idx is "+idx+" i is "+i+" curchar is "+curchar);
                printKeypadSubsequence(idx+1,combination+curchar, number);
                System.out.println("After return, combination left is "+ combination);
            }
        }

    public static void main(String[] args) {
        printKeypadSubsequence(0,"","23");
    }
}
