public class NWaitDemo {
    private static Object o = new Object();
    private static int n = 0;

    private static class Sub extends Thread {
        Sub() {
            //改写线程名字
            super("n--");
        }

        @Override
        public void run() {
            while (true) {
                synchronized (o) {
                    if (n == 0) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                    n--;
                    System.out.println(getName() + ":" + n);
                    o.notify();
                }
            }
        }
    }

    private static class Add extends Thread {
        Add() {
            super("n++");
        }

        @Override
        public void run() {
            while (true) {
                synchronized (o) {
                    if (n == 10) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
//由于锁还没释放，所以notify放在这里也是可以的
                    n++;
                    System.out.println(getName() + ":" + n);
                    o.notify();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread a = new Add();
        Thread b = new Sub();
        a.start();
        b.start();
    }
}
