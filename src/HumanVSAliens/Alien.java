package HumanVSAliens;

public class Alien {
    int health;

    public Alien(int health) {
        this.health = health;
    }

    public int attack(Human human){
        return human.health -= 20;
    }
}
