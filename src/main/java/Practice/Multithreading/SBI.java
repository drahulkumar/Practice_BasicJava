package Practice.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class SBI extends Bank implements Callable<Integer> {
    private Balance money;
    Lock lock;
    public SBI(Balance money , Lock lock){
        this.money = money;
        this.lock = lock;
    }

    public int debitMoney(int money){
        lock.lock();
        if(this.money.balance>money){
            int x = this.money.balance -money;
            System.out.println("Your current balance after debit is : " + x);
        }
        else{
            System.out.println("Your current balance after debit is : " + this.money.balance + " and you are requesting for " + money + "which is more than availble balce so debit cannot be proceeded");
        }
        lock.unlock();
        //int x = this.money.balance -money;

        return 0;

    }


    public void creditMoney(int money) {
        lock.lock();
        this.money.balance +=money;
        lock.lock();
        System.out.println("Your current balance after credit is : " + this.money.balance);
    }

    public int getCurrentBalance() {
        return this.money.balance;
    }

    @Override
    public Integer call(){
        creditMoney(100000);
        debitMoney(5000);
        creditMoney(4000);
        debitMoney(2000);
        return 0;
    }
}
