package Threading;
import  java.util.concurrent.ExecutorService;
import  java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        //ExecutorService executor = Executors.newFixedThreadPool(10);

        ExecutorService executor = Executors.newSingleThreadExecutor();

        ExecutorService executorcached = Executors.newCachedThreadPool();
        for(int i=0;i<1000000;i++){
            executor.execute(new PrintNnumber(i));
            //executorcached.execute(new PrintNnumber(i));
        }

        executor.shutdown();
    }
}
