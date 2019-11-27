import java.util.Scanner;

public class Test7 {
    /*public static int A(int[][] array,int a, int b){
        int start = array[0][0];
        int c = 0;
        int d = 0;
        int e = 0;
        while (c < a && d < b){
            e = A(array,c+1,d) + A(array,c,d+1);
        }
        return e;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[][] array = new int[x][y];
            System.out.println(A(array,x,y));
        }
    }*/
public int countWay2(int x,int y){
    /*if(x <= 1 && y <= 1) {
        return 0;
    }else if(x == 1 || y == 1){
        return 1;
    }else {
        return countWay2(x-1,y) + countWay2(x,y-1);
    }*/

    if(x == 1 || y == 1){
        return 1;
    }
    return countWay2(x-1,y) + countWay2(x,y-1);
}

   /* public int countWays(int x, int y) {
        if(x <=1 && y <=1){
            return 0;
        }else if(x == 1 || y == 1){
            return 1;
        }else{
            return countWays(x-1,y) + countWays(x,y-1);
        }

    }*/

    public static int count=0;
    public void Count(int x,int y,int i ,int j)
    {
        if(x-1==i&&y-1==j){
            count++;
            return ;
        }
        if(j+1<y) Count(x,y,i,j+1);
        if(i+1<x) Count(x,y,i+1,j);

    }


    public int countWays(int x, int y) {

        if(x <=1 && y <=1){
            return 0;
        }else if(x == 1 || y == 1){
            return 1;
        }else{
            Count(x,y,0,0);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        new Test7().countWays(x,y);
        System.out.println(count);
    }
}
