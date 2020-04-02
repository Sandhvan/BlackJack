/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package blackjack;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye, 2018
 */
public class Card {

    private String rankOfCard;//represents the rank of a card
    private String suitOfCard;//represents the suit of a card
    private int valueOfCard;//represents the value of a card
    private static String[] ranks = {"Two", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    private static String[] suits = {"Diamonds", "Clubs", "Spades", "Hearts"};

    Card(int suit, int rank) {
        rankOfCard = ranks[rank];
        suitOfCard = suits[suit];
    }

    public String getRankOfCard() {
        return rankOfCard;
    }

    public String getSuitOfCard() {
        return suitOfCard;
    }

    public int getValueOfCard() {
        int value = 11;
        switch (rankOfCard) {
            case "Ace":
                value = 11;
                break;
            case "Two":
                value = 2;
                break;
            case "Three":
                value = 3;
                break;
            case "Four":
                value = 4;
                break;
            case "Five":
                value = 5;
                break;
            case "Six":
                value = 6;
                break;
            case "Seven":
                value = 7;
                break;
            case "Eigth":
                value = 8;
                break;
            case "Nine":
                value = 9;
                break;
            case "Ten":
                value = 10;
                break;
            case "Jack":
                value = 10;
                break;
            case "Queen":
                value = 10;
                break;
            case "King":
                value = 10;
                break;
        }
        valueOfCard = value;
        return valueOfCard;
    }

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
}
