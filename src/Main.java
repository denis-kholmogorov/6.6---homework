import Clients.Individual;
import Clients.Legal;
import Clients.Physic;

public class Main {
    public static void main(String[] args) {

        Physic physic = new Physic(1000);
        physic.balance();
        physic.putMoney(555.55);
        physic.balance();
        physic.takeMoney(1000);
        physic.balance();
        physic.takeMoney(10000);
        physic.balance();
        System.out.println("/--------------------------------/");

        Legal legal = new Legal(2000);
        legal.balance();
        legal.putMoney(1000);
        legal.balance();
        legal.takeMoney(1500);
        legal.balance();
        legal.takeMoney(15000);
        legal.balance();
        System.out.println("/--------------------------------/");

        Individual individual = new Individual(3000);
        individual.balance();
        individual.putMoney(500);
        individual.balance();
        individual.putMoney(1000);
        individual.balance();
        individual.takeMoney(4000);
        individual.balance();
        individual.takeMoney(40000);
        individual.balance();
    }
}
