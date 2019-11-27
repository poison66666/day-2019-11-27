import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
       // while (sc.hasNext()){
            int n = sc.nextInt();
            ArrayList<Integer> array = new ArrayList<>();
            if(n<2){
                System.out.println(0);
            }else {
                for (int i = 0; i < n; i++) {
                    array.add(i);
                }
                int i = 0 + 2;
                while (array.size()>1){
                    array.remove(i);
                    i+=2;
                    while (i > array.size()-1){
                        i = i-array.size();
                    }
                }
                }
        System.out.println(array.get(0));
            }
       // }*/

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            if(N > 1000){
                N = 999;
            }
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0;i < N;i++){
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1){
                i = (i+2)%list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
