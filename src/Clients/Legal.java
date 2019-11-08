package Clients;

public class Legal extends Client{

    public Legal(double score){
        this.score = score;
    }

    @Override
    public void putMoney(double money) {
        this.score += money;
    }

    @Override
    public void takeMoney(double money) {
        this.score -= (money + (money * 0.01));
    }

    @Override
    public void balance() {
        System.out.println("Баланс счета равен = " + score );
    }
}
