public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);
        DeadLock.class.wait(1000);
    }
}
