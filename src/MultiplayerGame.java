import java.util.List;
import java.util.ArrayList;

public class MultiplayerGame {

    public void multiplayerStart() {

        // Deck initialization
        Deck deck = new Deck();

        // Deck suffling
        deck.deckShuffle();

        // Players Initialization
        List<Player> players = new ArrayList<>();
        players.add(new Player("Player 1"));
        players.add(new Player("Player 2"));
        players.add(new Player("Player 3"));
        players.add(new Player("Player 4"));

    }

    public int getPhoenixRank(){
        return 1;
    }
}
