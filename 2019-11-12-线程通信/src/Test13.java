/*
import java.math.BigInteger;
import java.util.Scanner;

public class Test13 {

    public String AddLongInteger(String addend,String augend){
        BigInteger a = new BigInteger(addend);
        BigInteger b = new BigInteger(augend);
        BigInteger c = a.add(b);
        return String.valueOf(c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        Test13 test = new Test13();
        String c = test.AddLongInteger(a,b);
        System.out.println(c);
    }
}
*/
/*
    设计一个算法完成两个超长正整数的加法
        设计参数：
                String addend:加数
                String augend：被加数
              返回值：加法结果
*/

import java.util.*;
import java.math.*;

public class Test13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String a=sc.next();
            String b=sc.next();
            BigInteger sum=new BigInteger(a);
            BigInteger sum1=new BigInteger(b);
            BigInteger res=sum.add(sum1);
            System.out.println(res);
        }
    }
}
