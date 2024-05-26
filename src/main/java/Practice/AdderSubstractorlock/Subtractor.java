package Practice.AdderSubstractorlock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock lock;

    public  Subtractor(Value v , Lock lock){
        this.v = v;
        this.lock = lock;
    }


    @Override
    public Void call(){
        for(int i=1;i<=5000000;i++){
            lock.lock();
            this.v.value -=1;
            lock.unlock();
        }


        return null;

    }

}
