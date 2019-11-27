import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        StringBuffer c = new StringBuffer(s);
        StringBuffer a = c.reverse();
        System.out.println(a.toString());*/

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res = "";
        while (num != 0){
            int a = num % 10;
            int b = num / 10;
            res = res + String.valueOf(a);
            num = b;
        }
        System.out.println(res);
    }
}
