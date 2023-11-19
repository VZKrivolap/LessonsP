package HumanVSAliens;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Alien alien = new Alien(100);
        Armor armor = new Armor(50);
        Human human = new Human(100, armor);


        do {
            Random random = new Random();
            int action = random.nextInt();
            if (action%2 == 0){
                alien.attack(human);
            } else {
                human.attack(alien);
            }
            System.out.println("Здоровье человека после атаки " + human.health);
            System.out.println("Здоровье пришельца после атаки " + alien.health);
        } while (alien.health >0 && human.health>0);
    }
}
