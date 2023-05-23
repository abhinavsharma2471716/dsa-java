package DAY3;
import java.util.*;

public class Strings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        int i;
        // It will work as well- Method 1
//        for(i=0;i<email.length();i++){
//            if(email.charAt(i)!='@'){
//                System.out.print(email.charAt(i));
//            }else{
//                break;
//            }
//        }

        String userName = "";


        for( i=0; i<email.length(); i++) {
            if(email.charAt(i) == '@') {
                break;
            } else {
                userName += email.charAt(i);
            }
        }


        System.out.println(userName);

    }
}
/*
username123@gmail.com
username123
 */