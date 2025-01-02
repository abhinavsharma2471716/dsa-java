package Recursion2;

import java.util.HashSet;

public class printUniqueSubsequences {
    public static void uniqueSubsequences(String str, int idx, String nextString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(nextString)) return;
            else {
                System.out.println(nextString);
                set.add(nextString);
                return;
            }
        }
        char curchar = str.charAt(idx);
        uniqueSubsequences(str, idx+1,nextString+curchar, set);
        uniqueSubsequences(str, idx+1,nextString,set);
    }
    public static void main(String[] args) {
        String str="aaa";
        HashSet<String> set = new HashSet<>();
        uniqueSubsequences(str,0,"",set);
    }
}
