import java.util.Scanner;

public class Main {
    static int[] weight;
    static int count = 0;
    static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            N = sc.nextInt();
            weight = new int[N+1];
            for(int i= 1;i<=N;i++){
                weight[i] = sc.nextInt();
            }
            Count(40,N);
            System.out.println(count);
        }
    }
    //s为剩余数量，n为不同种类
    private static void Count(int s, int n) {
        if(s == 0){
            ++count;
            return;
        }
        if(s < 0 || (s > 0 && n < 0)){
            return;
        }
        Count(s-weight[n],n-1);
        Count(s,n-1);
    }
}
