import java.util.*;

public class GrayCode {
   /* public String[] getGray(int n) {
        int size = (int)Math.pow(2,n);
        String[] arr = new String[size];

        if(n == 1){
            arr[0] = "0";
            arr[1] = "1";
            return arr;
        }

        String[] pre = getGray(n-1);
        for (int i = 0;i < pre.length;i++){
            arr[i] = "0"+ pre[i];
            arr[arr.length-1-i] = "1" + pre[i];
        }
        return arr;
    }*/
       public int add(int a,int b){
           try {
               return a+b;
           }
           catch (Exception e) {
               System.out.println("catch语句块");
           }
           finally{
               System.out.println("finally语句块");
           }
           return 0;
       }
       public static void main(String argv[]){
           GrayCode test =new GrayCode();
           System.out.println("和是："+test.add(9, 34));

       }
}