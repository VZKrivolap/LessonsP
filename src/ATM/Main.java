package ATM;

public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat();
        Card card1 = new Card();
        Card card2 = new Card();
        Human human1 = new Human(1000, card1);
        Human human2 = new Human(5000, card2);
        Card card = new Card();

    }
}
