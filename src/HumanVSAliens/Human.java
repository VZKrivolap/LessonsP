package HumanVSAliens;

public class Human extends Unit{
    Armor armor;

    public Human(int health, int attack) {
        super(health, attack);
    }


    public int attack(Alien alien){
        return alien.health -= 10;
    }
}
