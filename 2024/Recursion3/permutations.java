package Recursion3;

public class permutations {
    public static void printPermutations(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        System.out.println("Entering loop with str "+ str+ " and permutation "+permutation);
        for(int i=0;i<str.length();i++) {
            System.out.println("i value is "+ i);
            char curr = str.charAt(i);
            String newString = str.substring(0,i)+str.substring(i+1);
            System.out.println("newstring is "+newString+" ,curr is "+curr);
            printPermutations(newString, permutation+curr);
            System.out.println("After return, permutation string left is "+permutation+" and str is "+str+" and curr is "+curr);
        }
    }
    public static void main(String[] args) {
        printPermutations("abc","");
    }
}
/*
Entering loop
i value is 0
newstring is bc ,curr is a
Entering loop
i value is 0
newstring is c ,curr is b
Entering loop
i value is 0
newstring is  ,curr is c
abc
After return, permutation string left is ab and str is c
After return, permutation string left is a and str is bc
i value is 1
newstring is b ,curr is c
Entering loop
i value is 0
newstring is  ,curr is b
acb
After return, permutation string left is ac and str is b
After return, permutation string left is a and str is bc
After return, permutation string left is  and str is abc
i value is 1
newstring is ac ,curr is b
Entering loop
i value is 0
newstring is c ,curr is a
Entering loop
i value is 0
newstring is  ,curr is c
bac
After return, permutation string left is ba and str is c
After return, permutation string left is b and str is ac
i value is 1
newstring is a ,curr is c
Entering loop
i value is 0
newstring is  ,curr is a
bca
After return, permutation string left is bc and str is a
After return, permutation string left is b and str is ac
After return, permutation string left is  and str is abc
i value is 2
newstring is ab ,curr is c
Entering loop
i value is 0
newstring is b ,curr is a
Entering loop
i value is 0
newstring is  ,curr is b
cab
After return, permutation string left is ca and str is b
After return, permutation string left is c and str is ab
i value is 1
newstring is a ,curr is b
Entering loop
i value is 0
newstring is  ,curr is a
cba
After return, permutation string left is cb and str is a
After return, permutation string left is c and str is ab
After return, permutation string left is  and str is abc
 */