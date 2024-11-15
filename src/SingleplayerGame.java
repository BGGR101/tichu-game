import java.util.List;


public class SingleplayerGame {

    public void singleplayerStart() {

        List<Card> deck = Deck.createDeck();

        // Temporary print of deck
        for (Card card : deck) {
            System.out.println(card);


        }


    }

    public int getPhoenixRank(){
        return 1;
    }
}
