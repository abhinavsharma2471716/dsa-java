package DAY4;
import java.util.*;
public class updateBit {
    public static void main(String args[]){
        int number = 5; //0101
        Scanner sc = new Scanner(System.in);
        int pos = sc.nextInt();

        int changeBitTo = sc.nextInt(); //if 1 -> set bit, if 0 -> clear Bit

        //bit mask

        int bitmask = 1<<pos;
        int notbitmask = ~(bitmask);

        int result;

        if(changeBitTo == 1){
            result = bitmask | number;
        }else{
            result = notbitmask & number;
        }

        System.out.println(result);

    }
}
