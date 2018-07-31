package cards;

import javax.swing.ImageIcon;

public class Card {
    // instance variables for the card 
    private Suit suitValue;
    private MinorArcana rankValue;
    private ImageIcon cardImage;

    public Card(Suit suit, MinorArcana rank, ImageIcon cardFace) {
        cardImage = cardFace;
        suitValue = suit;
        rankValue = MinorArcana;
    }
    public static String getFilename( Suit suit, MinorArcana rank ) {
        //return rank.getSymbol() + suit.getSymbol() + ".gif";
    }

}
