package DAY5;

import java.sql.SQLOutput;

public class mergeSorting {
    public static void conquer(int[] arr,int si,int mid,int ei){
        System.out.println();
        System.out.println("Entering Conquer: "+" si: "+si+" mid: "+mid+" ei: "+ei);
      int[] merged = new int[ei-si+1];
      int idx1 =si;
      int idx2 =mid+1;
      int x =0;
        System.out.println("idx1: "+idx1+" mid: "+mid+" idx2: "+idx2+" ei: "+ei+" x: "+x);
      while(idx1<=mid && idx2<= ei){
          if(arr[idx1]<=arr[idx2]){
              System.out.println("In 1 "+"merge ("+x+")"+" = "+arr[idx1]);
              merged[x++]=arr[idx1++];

          }else{
              System.out.println("In 2 "+"merge ("+x+")"+" = "+arr[idx2]);
              merged[x++]=arr[idx2++];

          }
      }
      while(idx1<=mid){
          System.out.println("In 3 "+"merge ("+x+")"+" = "+arr[idx1]);
          merged[x++]=arr[idx1++];
      }

        while(idx2<=ei){
            System.out.println("In 4 "+"merge ("+x+")"+" = "+arr[idx2]);
            merged[x++]=arr[idx2++];
        }

        for(int i=0,j=si;i<merged.length;i++,j++){
            System.out.println();
            System.out.print("arr["+j+"]=merged["+i+"] i.e = "+merged[i]);
            System.out.println();
            arr[j]=merged[i];
        }
    }
    public static void divide(int[] arr, int si, int ei){
        if(si>=ei){
            System.out.println();
            System.out.println(" return at si: "+si+" ei : "+ei);
            System.out.println();
            return;
        }
        int mid = si+(ei-si)/2;
        System.out.println("divide(arr,si,mid)"+" si: "+si+" mid act as ei: "+mid+" ei: "+ei);
        divide(arr,si,mid);
        System.out.println("divide(arr,mid+1,ei)"+" mid+1 act as si: "+ (mid+1)+" ei: "+ei);
        divide(arr,mid+1,ei);
        System.out.println("conquer(arr,si,mid,ei)"+" si: "+si+" mid: "+mid+" ei: "+ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int[] arr = {6,5,2,7,7,8,3};
        int n = arr.length;
        divide(arr,0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        };
    }

}

/*
divide(arr,si,mid) si: 0 mid act as ei: 3 ei: 6
divide(arr,si,mid) si: 0 mid act as ei: 1 ei: 3
divide(arr,si,mid) si: 0 mid act as ei: 0 ei: 1

 return at si: 0 ei : 0

divide(arr,mid+1,ei) mid+1 act as si: 1 ei: 1

 return at si: 1 ei : 1

conquer(arr,si,mid,ei) si: 0 mid: 0 ei: 1

Entering Conquer:  si: 0 mid: 0 ei: 1
idx1: 0 mid: 0 idx2: 1 ei: 1 x: 0
In 1 merge (0) = 1
In 4 merge (1) = 5

arr[0]=merged[0] i.e = 1

arr[1]=merged[1] i.e = 5
divide(arr,mid+1,ei) mid+1 act as si: 2 ei: 3
divide(arr,si,mid) si: 2 mid act as ei: 2 ei: 3

 return at si: 2 ei : 2

divide(arr,mid+1,ei) mid+1 act as si: 3 ei: 3

 return at si: 3 ei : 3

conquer(arr,si,mid,ei) si: 2 mid: 2 ei: 3

Entering Conquer:  si: 2 mid: 2 ei: 3
idx1: 2 mid: 2 idx2: 3 ei: 3 x: 0
In 1 merge (0) = 2
In 4 merge (1) = 7

arr[2]=merged[0] i.e = 2

arr[3]=merged[1] i.e = 7
conquer(arr,si,mid,ei) si: 0 mid: 1 ei: 3

Entering Conquer:  si: 0 mid: 1 ei: 3
idx1: 0 mid: 1 idx2: 2 ei: 3 x: 0
In 1 merge (0) = 1
In 2 merge (1) = 2
In 1 merge (2) = 5
In 4 merge (3) = 7

arr[0]=merged[0] i.e = 1

arr[1]=merged[1] i.e = 2

arr[2]=merged[2] i.e = 5

arr[3]=merged[3] i.e = 7
divide(arr,mid+1,ei) mid+1 act as si: 4 ei: 6
divide(arr,si,mid) si: 4 mid act as ei: 5 ei: 6
divide(arr,si,mid) si: 4 mid act as ei: 4 ei: 5

 return at si: 4 ei : 4

divide(arr,mid+1,ei) mid+1 act as si: 5 ei: 5

 return at si: 5 ei : 5

conquer(arr,si,mid,ei) si: 4 mid: 4 ei: 5

Entering Conquer:  si: 4 mid: 4 ei: 5
idx1: 4 mid: 4 idx2: 5 ei: 5 x: 0
In 1 merge (0) = 4
In 4 merge (1) = 8

arr[4]=merged[0] i.e = 4

arr[5]=merged[1] i.e = 8
divide(arr,mid+1,ei) mid+1 act as si: 6 ei: 6

 return at si: 6 ei : 6

conquer(arr,si,mid,ei) si: 4 mid: 5 ei: 6

Entering Conquer:  si: 4 mid: 5 ei: 6
idx1: 4 mid: 5 idx2: 6 ei: 6 x: 0
In 2 merge (0) = 3
In 3 merge (1) = 4
In 3 merge (2) = 8

arr[4]=merged[0] i.e = 3

arr[5]=merged[1] i.e = 4

arr[6]=merged[2] i.e = 8
conquer(arr,si,mid,ei) si: 0 mid: 3 ei: 6

Entering Conquer:  si: 0 mid: 3 ei: 6
idx1: 0 mid: 3 idx2: 4 ei: 6 x: 0
In 1 merge (0) = 1
In 1 merge (1) = 2
In 2 merge (2) = 3
In 2 merge (3) = 4
In 1 merge (4) = 5
In 1 merge (5) = 7
In 4 merge (6) = 8

arr[0]=merged[0] i.e = 1

arr[1]=merged[1] i.e = 2

arr[2]=merged[2] i.e = 3

arr[3]=merged[3] i.e = 4

arr[4]=merged[4] i.e = 5

arr[5]=merged[5] i.e = 7

arr[6]=merged[6] i.e = 8
1 2 3 4 5 7 8


div(0,6) = 1) div(0,3) : 2)  div(4,6) : 3) con(0,3,6)
div(0,3) = 1) div(0,1) : 2)  div(2,3) : 3) con(0,1,3)
div(0,1) = 1) div(0,0) : 2)  div(1,1) : 3) con(0,0,1)
div(2,3) = 1) div(2,2) : 2)  div(3,3) : 3) con(2,2,3)
con(0,1,3) executes then.
div(4,6) ...and so on

 */