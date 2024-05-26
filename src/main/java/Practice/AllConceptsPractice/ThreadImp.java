package Practice.AllConceptsPractice;

public class ThreadImp extends Thread{

    public void run(){
        System.out.println("I am running a thread using " + Thread.currentThread().getName());
    }
}
