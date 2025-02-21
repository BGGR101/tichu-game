import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand = new ArrayList<>();
    private String name;
    private boolean grand;
    private boolean tichu;

    //Player Constructor
    public Player(String name) {
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
    
    //Setters
    public void setGrand(boolean grand) {
        this.grand = grand;
    }

    public void setTichu(boolean tichu) {
        this.tichu = tichu;
    }

    //Methods
    public void addCard(Card card) {
        hand.add(card);
    }

}
