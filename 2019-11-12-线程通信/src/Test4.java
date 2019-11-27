import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;
            for(int i = 0;i < n;i++){ //因为n除以5第一次除完有可能还有未除尽的5，所以用循环来解决
                n/=5;//本题主要判断有几个5
                count+=n;
            }
        System.out.println(count);*/

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for(int i = n;i>=5;i--){
            int temp = i;
            while (temp%5 == 0){
                res++;
                temp/=5;
            }
        }
        System.out.println(res);
    }
}
