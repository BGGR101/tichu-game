import java.util.List;
import java.util.ArrayList;
public class SingleplayerGame {

    public void singleplayerStart() {

        List<Card> deck = Deck.createDeck();

        // Εκτύπωση της τράπουλας
        for (Card card : deck) {
            System.out.println(card);


        }

    }
}
