import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private String name;
    private boolean grand;
    private boolean tichu;

    //Player Constructor
    public Player(String name) {
        this.hand = new ArrayList<>();
        this.name =  name;
        this.grand = false;
        this.tichu = false;
    }

    //Getters
    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

}
