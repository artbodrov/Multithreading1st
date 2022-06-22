public class ThreadC extends Thread{
    public void run(){
        Foo foo = new Foo();
        foo.third();
    }
}
