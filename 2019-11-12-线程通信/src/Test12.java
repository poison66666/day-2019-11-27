/*
import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        String N = sc.nextLine();
       // char[][] c = new char[M][M];
        for (int i = 0; i <M; i++) {
            for (int j = 0; j < M; j++) {

                if (i == 0 || i == (M/2)-1) {
                    System.out.print(N);
                } else if(i%2==1){
                    if (j == 0 ||j == M - 1)
                        System.out.print(N);
                    else {
                        System.out.print(" ");
                        System.out.print(" ");
                    }

                }

            }
            System.out.println();
        }
    }
}
*/
import java.util.Scanner;


public class Test12 {

    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N, len;
        String c;
        N = in.nextInt();   c = in.next();
        len = (N + 1) / 2;
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == 1 || i == len || j == 1 || j == N) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.printf("\n");
        }
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int len = (N+1)/2;
        String s = sc.next();

        for(int i = 1;i<=len;i++){
            for(int j = 1;j <= N;j++){
                if(i == 1 || i == len || j == 1 || j == N){
                    System.out.print(s);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}