package Clients;

public abstract class Client {
    protected double score;

    public abstract void putMoney(double money);

    public abstract void takeMoney(double money);

    public abstract void balance();
}
