package PrintNoUsingThread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Using Thread class
//        ThreadImp t1 = new ThreadImp(1);
//        t1.setName("Thread1");



//        for(int i=1;i<101;i++){
//            ThreadImp t = new ThreadImp(i);
//            t.start();
//        }



        // Using Runnable
        for(int i=0;i<100;i++){
            Thread t2 = new Thread(new RunnableImp(i));
            t2.start();
        }

//        for(int i=0;i<101;i++){
//            ExecutorService executor = Executors.newCachedThreadPool();
//            CallableImp c = new CallableImp(i);
//
//            Future<Long> result = executor.submit(c);
//
//            System.out.println(result.get());
//
//            executor.shutdown();
//        }





    }
}
