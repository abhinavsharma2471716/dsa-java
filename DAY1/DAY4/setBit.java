package DAY4;

public class setBit {
    public static void main(String args[]){
        int number =5; //0101
        // SetBit Problem - set 2nd bit( position 1) of a number 5 (n =0101)
        int pos =1;
        //bit mask ( '1'  left shift 'position' )
        int bitmask = 1<<pos;
        //Perform bitwise or operator between bitmask and number, get output with 0111 i.e 7
        int result =(bitmask | number);
            System.out.println(result);

    }
}
