package Threading;

public class Client {
    public static void main(String[] args) {
//        ThreadImp t1 = new ThreadImp();
//        t1.setName("Thread-1");
//        ThreadImp t2 = new ThreadImp();
//        t2.setName("Thread-2");
//        t1.start();
//        t2.start();
//
//        Thread t3 = new Thread(new RunnImp());
//        t3.start();

        //Print first 100 number
        for(int i=0 ; i<1000000;i++){
            Thread t = new Thread(new PrintNnumber(i));
            t.start();
        }

        //Factorial calculation


    }
}
