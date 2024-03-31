package Threading;

public class PrintNnumber implements Runnable{

    int num;
    public PrintNnumber(int num){
        this.num = num;
    }
    @Override
    public void run(){
        System.out.println("Printing number " + num + " from " + Thread.currentThread().getName());

    }
}
