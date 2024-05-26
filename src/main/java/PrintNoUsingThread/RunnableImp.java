package PrintNoUsingThread;

public class RunnableImp implements Runnable{

    int num;
    public RunnableImp(int num){
        this.num = num;
        num++;
    }

    @Override
    public void run(){
        System.out.println("Printing Number " + num + " from" + Thread.currentThread().getName());

    }
}
