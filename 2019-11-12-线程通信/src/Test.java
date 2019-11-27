/*
import java.util.Scanner;

public class Test {
    public static void c(){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int A = (n/4)*2+((n%4)<2?(n%4):2);
        int B = ((n-2)/4)*2 + (((n-2)%4)<2?((n-2)%4):2);

        int res = (m/4)*(A+B)*2;
        if(m%4>0)res+=A;
        if(m%4>1)res+=A;
        if(m%4>2)res+=B;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int count = 0;
        for(int i = 0;i<h;i++){
            int j =0;
            if(i/2%2 !=0){
                j=2;
            }
            for(;j<w;j+=4){
                if(j+1<w){
                    count +=2;
                }else{
                    count+=1;
                }
            }
        }
        */
/*int [][]data=new int[h][w];
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w;j++)
            {
                if(data[i][j]==0)
                {
                    if(i+2<h&&data[i+2][j]==1) continue;
                    else if(i-2>=0&&data[i-2][j]==1) continue;
                    else if(j+2<w&&data[i][j+2]==1) continue;
                    else if (j-2>=0&&data[i][j-2]==1) continue;
                    else {
                        data[i][j]=1;
                        count++;
                    }
                }
            }
        }*//*

        System.out.println(count);

    }
}*/
public class Test {
    public static void main(String [] args){
        System.out.println(new B().getValue());
    }
    static class A{
        protected int value;
        public A(int v) {
            setValue(v);
        }
        public void setValue(int value){
            this.value = value;
        }
        public int getValue(){
            try{
                value++;
                return value;
            } catch(Exception e){
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A{
        public B() {
            super(5);
            setValue(getValue() - 3);
        }
        public void setValue(int value){
            super.setValue(2 * value);
        }
    }
}