package Threading;

import java.util.concurrent.*;

class CallableInt implements Callable<Long>{
    int num;


    public  CallableInt(int num){
        this.num = num;

    }
    @Override
    public Long call() throws Exception {
        long fact = 1;

        for(int i=num;i>0;i--){

            fact = fact*i;
        }
        return fact;
    }

}

public class CallableDemo  {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableInt c = new CallableInt(5);
        ExecutorService executor = Executors.newFixedThreadPool(5);

        Future<Long> res = executor.submit(c);
        System.out.println(res.get());

        executor.shutdown();


    }


}
