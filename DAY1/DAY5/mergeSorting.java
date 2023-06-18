package DAY5;

import java.sql.SQLOutput;

public class mergeSorting {
    public static void conquer(int[] arr,int si,int mid,int ei){
        System.out.println("Entering Conquer: "+" si: "+si+" mid: "+mid+" ei: "+ei);
      int[] merged = new int[ei-si+1];
      int idx1 =si;
      int idx2 =mid+1;
      int x =0;
        System.out.println("idx1: "+idx1+" mid: "+mid+" idx2: "+idx2+" ei: "+ei+" x: "+x);
      while(idx1<=mid && idx2<= ei){
          if(arr[idx1]<=arr[idx2]){
              System.out.println(x+" is x in 1");
              merged[x++]=arr[idx1++];

          }else{
              System.out.println(x+" is x in 2");
              merged[x++]=arr[idx2++];

          }
      }
      while(idx1<=mid){
          System.out.println(x+" is x in 3");
          merged[x++]=arr[idx1++];
      }

        while(idx2<=ei){
            System.out.println(x+" is x in 4");
            merged[x++]=arr[idx2++];
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    public static void divide(int[] arr, int si, int ei){
        if(si>=ei){
            System.out.println(" return at si: "+si+" ei: "+ei);
            return;
        }
        int mid = si+(ei-si)/2;
        System.out.println("divide(arr,si,mid)"+" si: "+si+" mid: "+mid);
        divide(arr,si,mid);
        System.out.println("divide(arr,mid+1,ei)"+" mid+1: "+ (mid+1)+" ei: "+ei);
        divide(arr,mid+1,ei);
        System.out.println("conquer(arr,si,mid,ei)"+" si: "+si+" mid: "+mid+" ei: "+ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int[] arr = {1,5,2,7,4,8,3};
        int n = arr.length;
        divide(arr,0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        };
    }

}

/*
"C:\Program Files\Java\jdk1.8.0_221\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1.1\lib\idea_rt.jar=52117:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2023.1.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Program Files\Java\jdk1.8.0_221\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_221\jre\lib\rt.jar;C:\Users\abhin\OneDrive\Documents\DSA\dsa\Java\out\production\dsa" DAY5.mergeSorting
divide(arr,si,mid) si: 0 mid: 3
divide(arr,si,mid) si: 0 mid: 1
divide(arr,si,mid) si: 0 mid: 0
 return at si: 0 ei: 0
divide(arr,mid+1,ei) mid+1: 1 ei: 1
 return at si: 1 ei: 1
conquer(arr,si,mid,ei) si: 0 mid: 0 ei: 1
Entering Conquer:  si: 0 mid: 0 ei: 1
idx1: 0 mid: 0 idx2: 1 ei: 1 x: 0
0 is x in 1
1 is x in 4
divide(arr,mid+1,ei) mid+1: 2 ei: 3
divide(arr,si,mid) si: 2 mid: 2
 return at si: 2 ei: 2
divide(arr,mid+1,ei) mid+1: 3 ei: 3
 return at si: 3 ei: 3
conquer(arr,si,mid,ei) si: 2 mid: 2 ei: 3
Entering Conquer:  si: 2 mid: 2 ei: 3
idx1: 2 mid: 2 idx2: 3 ei: 3 x: 0
0 is x in 1
1 is x in 4
conquer(arr,si,mid,ei) si: 0 mid: 1 ei: 3
Entering Conquer:  si: 0 mid: 1 ei: 3
idx1: 0 mid: 1 idx2: 2 ei: 3 x: 0
0 is x in 1
1 is x in 2
2 is x in 1
3 is x in 4
divide(arr,mid+1,ei) mid+1: 4 ei: 6
divide(arr,si,mid) si: 4 mid: 5
divide(arr,si,mid) si: 4 mid: 4
 return at si: 4 ei: 4
divide(arr,mid+1,ei) mid+1: 5 ei: 5
 return at si: 5 ei: 5
conquer(arr,si,mid,ei) si: 4 mid: 4 ei: 5
Entering Conquer:  si: 4 mid: 4 ei: 5
idx1: 4 mid: 4 idx2: 5 ei: 5 x: 0
0 is x in 1
1 is x in 4
divide(arr,mid+1,ei) mid+1: 6 ei: 6
 return at si: 6 ei: 6
conquer(arr,si,mid,ei) si: 4 mid: 5 ei: 6
Entering Conquer:  si: 4 mid: 5 ei: 6
idx1: 4 mid: 5 idx2: 6 ei: 6 x: 0
0 is x in 2
1 is x in 3
2 is x in 3
conquer(arr,si,mid,ei) si: 0 mid: 3 ei: 6
Entering Conquer:  si: 0 mid: 3 ei: 6
idx1: 0 mid: 3 idx2: 4 ei: 6 x: 0
0 is x in 1
1 is x in 1
2 is x in 2
3 is x in 2
4 is x in 1
5 is x in 1
6 is x in 4
1 2 3 4 5 7 8
Process finished with exit code 0

 */