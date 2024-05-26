package Practice.Multithreading;

public abstract class Bank {
    public abstract int getCurrentBalance();
    public abstract int debitMoney(int money);

    public abstract void creditMoney(int money);

}
