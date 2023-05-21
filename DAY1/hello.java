import org.w3c.dom.ls.LSInput;
import sun.awt.OSInfo;

import java.util.Scanner;

public class hello {


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++) {
            int g=0;
            while(g <= i) {
                System.out.print("* ");
                g++;
            }
            System.out.println("");

        }
    }
}
