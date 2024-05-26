package Practice.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        Balance balance = new Balance();
        Bank sbi = new SBI(new Balance() , lock);


        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for(int i=0;i<5;i++){
            executorService.submit(new SBI(balance , lock));
            //executorService.shutdown();
        }



        System.out.println(balance.balance);

        executorService.shutdown();



    }
}
