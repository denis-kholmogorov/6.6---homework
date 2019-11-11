package Clients;

public class Legal extends Client{

    private double score;

    public Legal(double score){
        this.score = score;
    }

    @Override
    public void putMoney(double money) {
        this.score += money;
    }

    @Override
    public void takeMoney(double money) {
        if (money <= this.score) {
            this.score -= (money + (money * 0.01));
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
