package HumanVSAliens;

public class Alien extends Unit{


    public Alien(int health, int attack) {
        super(health, attack);
    }

    public int attack(Human human){
        return human.health -= attack;
    }
}
