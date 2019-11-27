public class OneTwoThree {
    private static class Foo {
        private volatile int n = 0;

        //虽然n不为0，但不让出cpu，导致n无法及时变化
        public void oneVersion1(){
            synchronized (this){
                if(n != 0){
                    return;
                }
                System.out.println("one");
                n = 1;
            }
        }

        //减少了锁的开销
        public void oneVersion2() {
            if(n != 0){
                return;
            }
            System.out.println("one");
            n = 1;
            //用volatile保证了n的可见性，及时反馈到主内存中去
        }

        //条件不满足时及时释放cpu，但是还是参与cpu的争夺
        public void oneVersion3(){
            if(n != 0){
                Thread.yield();
                return;
            }
            System.out.println("one");
            n = 1;
        }

        //条件不满足，让出cpu，并且不再参与cpu的争夺
        public void oneVersion4() throws InterruptedException {
            if(n != 0){
                synchronized (this){
                    wait();
                }
                return;
            }
            //两句话的次序不能颠倒
            System.out.println("one");
            n = 1;
            synchronized (this){
                notifyAll();
            }
        }
        public void one() throws InterruptedException {
            if(n != 0) {
                synchronized (this) {
                    wait();
                }
                return;
            }
            System.out.println("one");
            n = 1;
            synchronized (this){
                notifyAll();
            }
        }

        public void two() throws InterruptedException {
            if(n != 1) {
                synchronized (this) {
                    wait();
                }
                return;
            }
            System.out.println("two");
            n = 2;
            synchronized (this){
                notifyAll();
            }
        }

        public void three() {
            synchronized (this) {
                if (n == 2) {
                    n = 0;
                    // 这里
                    System.out.println("three");
                }
            }
            Thread.yield();
        }
    }

    private static Foo foo = new Foo();

    private static class OneThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    foo.one();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class TwoThread extends Thread {
        @Override
        public void run() {
            while (true) {
                try {
                    foo.two();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class ThreeThread extends Thread {
        @Override
        public void run() {
            while (true) {
                foo.three();
            }
        }
    }

    public static void main(String[] args) {
        Thread one = new OneThread();
        Thread two = new TwoThread();
        Thread three = new ThreeThread();
        one.start();
        two.start();
        three.start();
    }
}
