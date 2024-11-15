import java.util.ArrayList;
import java.util.List;


public class Deck {

    public static List<Card> createDeck() {
        List<Card> deck = new ArrayList<>();

        // initialization of normal cards
        String[] colors = {"Blue", "Green", "Black", "Red"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int[] ranks = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};


        // creation of normal cards
        for (String color : colors) {
            for (int i = 0; i < numbers.length; i++) {
                String imagePath = "../Textures/deck/" + color + "-" + numbers[i] + ".png";
                deck.add(new Card(ranks[i], color, numbers[i], imagePath));
            }
        }


        // initialization of special cards
        deck.add(new Card(phoenixRank, "Phoenix", "Special", "../Textures/deck/Phoenix.png"));
        deck.add(new Card(16, "Dragon", "Special", "../Textures/deck/Dragon.png"));
        deck.add(new Card(1, "Mahjong", "Special", "../Textures/deck/Mahjong.png"));
        deck.add(new Card(0, "Dog","Special" , "../Textures/deck/Dog.png"));

        return deck;

    }
}