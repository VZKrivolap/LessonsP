package HumanVSAliens;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        List<Alien> alienList = new ArrayList<>();
        List<Human> humanList = new ArrayList<>();

        Alien alien1 = new Alien(100, 30);
        Alien alien2 = new Alien(100, 40);
        Alien alien3 = new Alien(100, 15);

        Human human1 = new Human(70, 20);
        Human human2 = new Human(80, 60);
        Human human3 = new Human(50, 50);

        alienList.add(alien1);
        alienList.add(alien2);
        alienList.add(alien3);

        humanList.add(human1);
        humanList.add(human2);
        humanList.add(human3);

//        do {
//            Random random = new Random();
//            int action = random.nextInt();
//            if (action%2 == 0){
//                alien.attack(human);
//            } else {
//                human.attack(alien);
//            }
//            System.out.println("Здоровье человека после атаки " + human.health);
//            System.out.println("Здоровье пришельца после атаки " + alien.health);
//        } while (alien.health >0 && human.health>0);
    }
}
