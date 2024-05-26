package Practice.AdderSubstractorlock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;


public class Adder implements Callable<Void> {

    private Value v;
    private Lock lock;

    public Adder(Value v , Lock lock){
        this.v = v;
        this.lock = lock;

    }

    public Void call(){
        for(int i=0;i<5000000 ;i++){
            lock.lock();
            this.v.value++;
            lock.unlock();
        }
        return null;

    }
}
