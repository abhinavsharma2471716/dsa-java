package DAY3;
import java.util.*;

public class replaceChar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 =sc.nextLine();
        String s2 = "";

        int i;
        for(i=0;i<s1.length();i++){
            if(s1.charAt(i)=='e'){
                s2+='i';
            }else{
                s2+=s1.charAt(i);
            }
        }
        System.out.println(s2);

    }
}
/*
abcdef
abcdif
 */