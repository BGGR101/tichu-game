package com.tichu.model;

import com.tichu.model.cards.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Deck {
    private List<Card> deck;

    public Deck() {
        this.deck = new ArrayList<>();
        initDeck();
    }

    public void initDeck() {

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
        deck.add(new Phoenix());
        deck.add(new Dragon());
        deck.add(new Mahjong());
        deck.add(new Dog());

    }
    //Perhaps temporary
    public List<Card> getDeck() {
        return deck;
    }

    public void deckShuffle(){
        Collections.shuffle(deck);
    }

    public void removeCard(int index){
        deck.remove(index);
    }
}