package DAY4;

public class getbit {
    public static void main(String args[]){
        int number =5; //0101
        // GetBit Problem - Find 3rd bit( position 2) ofa number 5
        int pos =2;
         //bit mask ( '1'  left shift 'position' )
        int bitmask = 1<<pos;
        //Perform bitwise and operator between bitmask and number, if result is zero then bit is zero else 1
         if((bitmask & number) == 0){
             System.out.println("bit is zero");
         }else{
             System.out.println("bit is one");
         }
    }
}
