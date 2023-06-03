package Recursion2;

public class firstandlastoccurence {
    public static int first=-1;
    public static int last=-1;

    public static void printOccurence(String str, char element, int idx){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(idx)=='a'){
            if(first == -1){
                first=idx;
            }else
            last=idx;
        }

        printOccurence(str,'a',idx+1);

    }
    public static void main(String[] args) {
        printOccurence("aabab",'a',0);


    }
}
