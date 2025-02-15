import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Card {
    private int rank;
    private String number;
    private String color;
    private BufferedImage image;
    private BufferedImage backImage;

    //constructor
    public Card(int rank, String number, String color, String imagePath) {
        this.rank = rank;
        this.number = number;
        this.color = color;

    //exception
        try {
            this.backImage = ImageIO.read(new File("../Textures/Deck/back.png"));
            this.image = ImageIO.read(new File(imagePath));
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

    public int getRank() {
        return rank;
    }

    public String getColor() {
        return color;
    }


}
