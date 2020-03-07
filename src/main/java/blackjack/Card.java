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
 * @modifier Vanshdeep Singh ,06/03/2020;
 */
public abstract class Card {

    //default modifier for child classes
    private int rankOfCard;//represents the rank of a card
    private int suitOfCard;//represents the suit of a card
    private int valueOfCard;//represents the value of a card
    private static String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    private static String[] suits = {"Diamonds", "Clubs", "Spades", "Hearts"};

    public int getRankOfCard() {
        return rankOfCard;
    }

    public void setRankOfCard(int rankOfCard) {
        this.rankOfCard = rankOfCard;
    }

    public int getSuitOfCard() {
        return suitOfCard;
    }

    public void setSuitOfCard(int suitOfCard) {
        this.suitOfCard = suitOfCard;
    }

    public int getValueOfCard() {
        if (rankOfCard > 10) {
            valueOfCard = 10;
        } else {
            valueOfCard = rankOfCard;
        }
        return valueOfCard;
    }

    public void setValueOfCard(int valueOfCard) {
        this.valueOfCard = valueOfCard;
    }

    public static String[] getRanks() {
        return ranks;
    }

    public static void setRanks(String[] ranks) {
        Card.ranks = ranks;
    }

    public static String[] getSuits() {
        return suits;
    }

    public static void setSuits(String[] suits) {
        Card.suits = suits;
    }

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
    @Override
    public abstract String toString();

}
