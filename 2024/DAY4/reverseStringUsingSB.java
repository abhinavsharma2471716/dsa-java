package DAY4;
import java.util.*;
public class reverseStringUsingSB {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        // Method 1: sb.reverse(); System.out.println(sb);

        //Method 2:
        for(int i=0; i<sb.length()/2; i++) {
            int front = i;
            int back = sb.length() - i - 1;


            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);


            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }


        System.out.println(sb);
    }
}
