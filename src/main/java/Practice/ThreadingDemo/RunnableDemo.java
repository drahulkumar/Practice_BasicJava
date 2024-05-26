package Practice.ThreadingDemo;

public class RunnableDemo implements Runnable{
    private int num;

    public RunnableDemo(int num){
        this.num = num;
    }
    @Override
    public void run(){
        System.out.println("I am a runnable thread printing  " + num + " using " +  Thread.currentThread().getName());
    }
}
