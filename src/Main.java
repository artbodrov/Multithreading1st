public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();
        a.start();
        b.join();
        c.join();
        b.start();
        c.join();
        c.start();
    }
}