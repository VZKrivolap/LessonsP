package ATM;

public class Bankomat {

    public void giveMoney(Human human, int money) {
        if (human.card.pin == 123) {
            if(money<=human.card.balance){
            human.nalichka += money;
            } else {
                System.out.println("Не хватает денег");
            }
        } else {
            System.out.println("Пин код не верный");
        }
    }

    public void showBalance(Human human){
        System.out.println(human.card.balance);
    }

    public void transaction(Human human1, Human human2, int sum){
        human1.card.balance += sum;
        human2.card.balance -= sum;
    }

    public void putMoney(Human human, int money){
        human.card.balance += money;
    }
}
