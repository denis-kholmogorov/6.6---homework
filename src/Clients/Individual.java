package Clients;

public class Individual extends  Client{

    public Individual(double score){
        this.score = score;
    }

    @Override
    public void putMoney(double money) {
        if (money < 1000) {
            this.score += (money - (money * 0.01));
        }
        else if (money >= 1000){
            this.score += (money - (money * 0.005));
        }
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
