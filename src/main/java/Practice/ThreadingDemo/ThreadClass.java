package Practice.ThreadingDemo;

public class ThreadClass extends Thread{
    int num;
    public ThreadClass(int num){
        this.num = num;
    }
    public void run(){
        System.out.println("Printing Number "+ num  + "using" + Thread.currentThread().getName());
    }
}
