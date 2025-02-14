import java.util.List;
import java.util.ArrayList;

public class HostGame {

    public void HostGame() {

        // Game initialization
        Boolean gameStarted = false;

        // Deck initialization
        Deck deck = new Deck();

        // Deck shuffling
        deck.deckShuffle();

        // Lobby initialization
        List<Player> lobby = new ArrayList<>();
//        lobby.add();
//        lobby.add();
//        lobby.add();
//        lobby.add();

    }

    public int getPhoenixRank(){
        return 1;
    }
}
