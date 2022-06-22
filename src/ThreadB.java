public class ThreadB extends Thread{
    public void run(){
        Foo foo = new Foo();
        foo.second();
    }
}
