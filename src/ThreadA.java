public class ThreadA extends Thread{
    public void run(){
        Foo foo = new Foo();
        foo.first();
    }
}
