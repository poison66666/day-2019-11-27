import java.util.Scanner;

public class Test1 {
    //最大公约数
    private static int fun1(int a,int b){
        int num = 1;
        for(int i = 1;i <= a && i <= b;i++){
            if (a % i == 0 && b % i == 0) {
                num = i;
            }
        }
        return num;
    }

    //最小公倍数=两数相乘除以两数的最大公约数
    private static int fun(int m,int n){
        return n*m/fun1(m,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(fun(x,y));
        }
    }
}
