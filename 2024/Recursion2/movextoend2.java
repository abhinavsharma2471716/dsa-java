package Recursion2;

public class movextoend2 {
    public static String addX(int count) {
        String newStr = "";
        for(int i=0;i<count; i++) {
            newStr += 'x';
        }
        return newStr;
    }
    public static String moveAllX(String str, int idx, int count) {
        if(idx == str.length()) {
            return addX(count);
        }
        if(str.charAt(idx) == 'x') {


            return moveAllX(str, idx+1, count+1);
        } else {
            String nextStr = moveAllX(str, idx+1, count);
            return str.charAt(idx) + nextStr;
        }
    }
    public static void main(String args[]) {
        String str = "abcdefxghxixjxxxk";
        int count = 0;
        String newStr = moveAllX(str, 0, count);
        System.out.println(newStr);
    }
}