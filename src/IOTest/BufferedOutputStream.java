package IOTest;


import java.util.concurrent.locks.ReentrantLock;

public class BufferedOutputStream{
    //新增了readLine()和NewLine
    public static void main(String[] args) {
        th p=new th();
        Thread a=new Thread(p,"线程A");
        Thread b=new Thread(p,"线程B");
        Thread c=new Thread(p,"线程C");
        Thread d=new Thread(p,"线程D");
        System.out.println("git");
        b.start();
//        c.start();
        a.start();
//        d.start();
    }
}
class th  implements Runnable {
    int a=100;
    ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        try {
            ki();
            ku();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void ki() throws InterruptedException {
        lock.lock();
        while (true) {
            if (a > 0) {
                System.out.println("序号:" + a + Thread.currentThread().getName());
                a--;
            }else {
                break;
            }
        }
        lock.unlock();
        notifyAll();
    }
    public void ku() throws InterruptedException {
        lock.lock();
        while (true) {
            if (a > 0) {
                System.out.println("序号:" + a + Thread.currentThread().getName());
                a--;
            }else {
                break;
            }
        }
        lock.unlock();
        notifyAll();
    }
}