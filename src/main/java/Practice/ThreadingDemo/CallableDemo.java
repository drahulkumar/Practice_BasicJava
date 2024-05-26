package Practice.ThreadingDemo;

import java.util.concurrent.Callable;

public class CallableDemo implements Callable<Integer> {


    @Override
    public Integer call(){
        System.out.println("Rerun");
        return 0;
    }
}
