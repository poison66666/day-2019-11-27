
import java.util.Scanner;

public class Test8 {
        /*int[] count = new int[] {0,0,0,0,0,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        for(int i = 0;i <c.length;i++){
            switch (c[i]){
                case '0' :
                    ++count[0];
                    break;
                case '1':
                    ++count[1];
                    break;
                case '2':
                    ++count[2];
                    break;
                case '3':
                    ++count[3];
                    break;
                case '4':
                    ++count[4];
                    break;
                case '5':
                    ++count[5];
                    break;
                case '6':
                    ++count[6];
                    break;
                case '7':
                    ++count[7];
                    break;
                case '8':
                    ++count[8];
                    break;
                case '9':
                    ++count[9];
                    break;
                    default:
                        break;
            }
        }

        for(int i = 0;i<count.length;i++){
            if(count[i] != 0){
                System.out.println(i+":"+count[i]);
            }
        }*/

        public static void main(String args[]) {
            Thread t = new Thread() {
                public void run() {
                    pong();
                }
            };
            t.run();
            System.out.print("ping");
        }
        static void pong() {
            System.out.print("pong");
        }
}