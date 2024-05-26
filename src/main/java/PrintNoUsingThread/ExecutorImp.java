package PrintNoUsingThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorImp {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for(int i=0;i<101;i++){
            executor.execute(new RunnableImp(i));
        }


    }


}
