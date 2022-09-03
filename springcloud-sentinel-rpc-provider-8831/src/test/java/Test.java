import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

    @org.junit.Test
    public void  t1(){
        Lock lock = new ReentrantLock();
        lock.tryLock();
        System.out.println(1);
    }
}
