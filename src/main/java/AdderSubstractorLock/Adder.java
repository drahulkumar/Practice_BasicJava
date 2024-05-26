package AdderSubstractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Integer> {
    int count;
    Lock lock;

    public Adder(int count , Lock lock){
        this.count = count;
        this.lock = lock;
    }




    @Override
    public Integer call(){
        return 0;
    }
}
