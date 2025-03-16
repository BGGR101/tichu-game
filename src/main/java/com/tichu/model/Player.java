package com.tichu.model;

import com.tichu.model.cards.Card;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand = new ArrayList<>();
    private String name;
    private boolean grand;
    private boolean tichu;
    private BufferedImage playerImage;

    //com.tichu.model.Player Constructor
    public Player(String name) {
        this.name =  name;
        this.grand = false;
        this.tichu = false;
        loadimage();
    }

    void loadimage() {
        try {
            playerImage = ImageIO.read(new File("../user.png"));
        } catch (IOException e) {
            System.err.println("Error loading image: " + "../user.png");
        }
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
