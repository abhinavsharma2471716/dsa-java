package DAY4;
import java.sql.SQLOutput;
import java.util.*;
public class stringBuilder {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //Declaration
        StringBuilder name = new StringBuilder(sc.nextLine()); //Abhinav

        // Get a char at index
        System.out.println(name.charAt(4)); //n
        System.out.println(name); //Abhinav

        //Set a char at index
        //name.setCharAt(10, 'S'); ////only in available range of indexes of string name //Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 10
        //at java.lang.AbstractStringBuilder.setCharAt(AbstractStringBuilder.java:407)
        //at java.lang.StringBuilder.setCharAt(StringBuilder.java:76)
        //at DAY4.stringBuilder.main(stringBuilder.java:16)

        name.setCharAt(2, 'S');
        System.out.println(name); //AbSinav

        //Insert a char at index
   //     name = name.insert(10, 'S'); //only in available range of indexes of string name //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
//        at java.lang.System.arraycopy(Native Method)
//        at java.lang.AbstractStringBuilder.insert(AbstractStringBuilder.java:1215)
//        at java.lang.StringBuilder.insert(StringBuilder.java:338)
//        at DAY4.stringBuilder.main(stringBuilder.java:25)

        name = name.insert(2, 'S');
        System.out.println(name); //AbSSinav

        //Delete a char
        name.delete(2,4);
        System.out.println(name); //Abinav, 2 is inclusive and 4 is not inclusive

        //insert h
        name.insert(2,'h');
        System.out.println(name); //Abhinav

        //Adding a string
        name.append(" Ji");
        System.out.println(name); //Abhinav Ji

    }
}
