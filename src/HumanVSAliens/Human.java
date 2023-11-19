package HumanVSAliens;

public class Human {
    int health;
    Armor armor;

    public Human(int health, Armor armor) {
        this.health = health;
        this.armor = armor;
    }

    public int attack(Alien alien){
        return alien.health -= 10;
    }
}
