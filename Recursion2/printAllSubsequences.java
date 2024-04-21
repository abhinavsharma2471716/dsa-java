package Recursion2;

public class printAllSubsequences {
    public static void printSubsequences(String str, int idx, String combinations){
        if(idx==str.length()){
            System.out.println("new string => "+combinations);
            return;
        }
        char curchar = str.charAt(idx);
        System.out.println("Adding char to index "+idx+" => "+curchar+" old string: "+combinations);
        printSubsequences(str, idx+1, combinations+curchar);
        System.out.println("Ignore char to index "+idx+" => "+curchar+" "+combinations);
        printSubsequences(str,idx+1,combinations);
    }
    public static void main(String[] args) {
        printSubsequences("abc",0,"");
    }
}
