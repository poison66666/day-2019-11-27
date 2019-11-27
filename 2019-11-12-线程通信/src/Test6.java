import java.util.Scanner;

public class Test6 {
    public static int Fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }else{
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        //while (sc.hasNext()){
            int N = sc.nextInt();
            for(int i = 0; i< N;i++){
                if(N >= Fibonacci(i) && N <= Fibonacci(i+1)) {
                    if(N-Fibonacci(i) <= Fibonacci(i+1)-N) {
                        System.out.println(N-Fibonacci(i));
                        break;
                    }else{
                        System.out.println(Fibonacci(i+1)-N);
                        break;
                    }
                }
           // }*/

        Scanner sc = new Scanner(System.in);
        int n = 0;
        int a = 0; int b = 1; int c = 1;

         if(sc.hasNextInt()){
            n = sc.nextInt();
        }
        while (c < n){
             a = b;
             b = c;
             c = a + b;
        }
         int A = n - b;
         int B = c - n;
        System.out.println(A < B ? A : B);
        }
    }

