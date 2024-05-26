package Practice.ThreadingDemo;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import PrintNoUsingThread.ThreadImp;


public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ThreadClass t1 = new ThreadClass();
//        t1.start();



//        for(int i=0;i<101;i++){
//            ThreadClass t1 = new ThreadClass(i);
//            t1.start();
//        }

//        Thread t2 = new Thread(new RunnableDemo());
//        t2.start();


        ExecutorService executor = Executors.newFixedThreadPool(5);


        //executor.execute(new RunnableDemo(4));

//        for(int i=0;i<101;i++){
//            executor.execute(new RunnableDemo(i));
//        }
//

        Future<Integer> result = executor.submit(new CallableDemo());

        System.out.println("Result is" + result.get());


        executor.shutdown();


    }
}
