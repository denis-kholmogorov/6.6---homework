package Clients;

public class Physic extends Client{

    public Physic(double score){
        this.score = score;
    }

    @Override
    public void putMoney(double money) {
        this.score += money;
    }

    @Override
    public void takeMoney(double money) {
        this.score -= money;
    }

    @Override
    public void balance() {
        System.out.println("Баланс счета равен = " + score );
    }
}
