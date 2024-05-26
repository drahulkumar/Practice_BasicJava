package PrintNoUsingThread;

import java.util.concurrent.Callable;

public class CallableImp implements Callable<Long> {
    int num;

    public  CallableImp(int num){
        this.num = num;
    }
    @Override
    public Long call(){

        return  (long)num*num;


    }
}
