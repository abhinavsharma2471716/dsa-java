package Recursion2;

public class removeDuplicates {
    public static boolean[] map = new boolean[26];
    //The default value for a boolean is false

    public static void remDup(String str, int idx, String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }

        char curChar =str.charAt(idx);
        if(map[curChar-'a'] == true){
            remDup(str, idx+1, newstr);
        }else{
            newstr+= curChar;
            map[curChar - 'a']=true;
            remDup(str,idx+1,newstr);

        }
    }
    public static void main(String[] args) {
          remDup("aabbccdda",0,"");
    }
}
