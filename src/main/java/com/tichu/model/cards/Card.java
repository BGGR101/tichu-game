package com.tichu.model.cards;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Card {
    private float rank;
    private String number;
    private String color;
    private BufferedImage image;
    private BufferedImage backImage;

    //Constructor for normal cards
    public Card(float rank, String number, String color, String imagePath) {
        this.rank = rank;
        this.number = number;
        this.color = color;
        loadImages(imagePath);
    }
    //Protected constructor for special cards
    protected Card(float rank, String number, String color) {
        this.rank = rank;
        this.number = number;
        this.color = color;
        loadImages("../Textures/com.tichu.model.Deck/" + number.toLowerCase() + ".png");
    }
    //load images
    private void loadImages(String imagePath) {
        try {
            this.image = ImageIO.read(new File(imagePath));
            this.backImage = ImageIO.read(new File("../Textures/com.tichu.model.Deck/back.png"));
        } catch (IOException e) {
            System.err.println("Error loading image: " + imagePath);
        }
    }
    //Getters
    public String getNumber(){
        return number;
    }

    public BufferedImage getImage() {
        return image;
    }

    public float getRank() {
        return rank;
    }

    public String getColor() {
        return color;
    }

    //Rank setter
    public void setRank(float rank) {
        this.rank = rank;
    }

}
