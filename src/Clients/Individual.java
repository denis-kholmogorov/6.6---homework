package Clients;

public class Individual extends  Client{

    private double score;

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
        if (money <= this.score) {
            this.score -= money;
        }
        else{
            System.out.println("У Вас неадостаточно средств на счету ");
        }
    }

    @Override
    public void balance() {
        System.out.println("Баланс счета равен = " + score);
    }
}
