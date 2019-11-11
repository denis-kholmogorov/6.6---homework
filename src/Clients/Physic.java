package Clients;

public class Physic extends Client{

    private double score;

    public Physic(double score){
        this.score = score;
    }

    @Override
    public void putMoney(double money) {
        this.score += money;
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
        System.out.println("Баланс счета равен = " + score );
    }
}
