package PrintNoUsingThread;

public class ThreadImp extends Thread{
    int num;

    public ThreadImp(int num){
        this.num = num;
    }

    public void run(){
        System.out.println("Printing NUmber" + num + "from" + Thread.currentThread().getName());




    }


}
