package DAY2;
import java.util.*;

public class function {

    public static void printMyName(String name){
        System.out.println(name);
        return; //return type to come out of void function
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        printMyName(name); //Calling Function

    }

}
