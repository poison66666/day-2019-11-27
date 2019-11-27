import java.util.Scanner;

public class WaitDemo {
    private static Object object = new Object();

    public static class A extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            // 等待 B 线程启动，并完成某个条件
            synchronized (object) {
                try {
                    object.wait();//先释放object锁，
                    // 把线程放到object对象的等待集中，
                    // 把线程状态变为waiting
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = 100; i < 110; i++) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Thread a = new A();
        a.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("我不输入，A 线程就绝对不会动");
        scanner.nextLine();
        synchronized (object) {
            object.notify();//被唤醒后
            //1.把A线程中等待集中取出
            //2.把A线程的状态变为runnable
            //3.尝试重新抢object的锁
        }
    }
}
