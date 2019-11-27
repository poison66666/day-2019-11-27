
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        char[] c = N.toCharArray();

        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<10;i++){
            list.add(0);
        }

        for(int j = 0;j<c.length;j++){
            list.set(c[j]-'0',list.get(c[j]-'0')+1);
        }

        for(int z = 0;z<list.size();z++){
            if(list.get(z) > 0){
                System.out.println(z + ":" + list.get(z));
            }
        }
    }
}
