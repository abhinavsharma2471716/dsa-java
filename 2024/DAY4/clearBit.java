package DAY4;
import java.util.*;
public class clearBit {
    public static void main(String args[]){
        int number =5; // 0101
        int pos = 2;

        //Bit Mask, 1 left shift pos
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask);

        int result = notBitMask & number;
        System.out.println(result); //0001 --> 1
    }
}
