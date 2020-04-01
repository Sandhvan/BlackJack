package blackjack;

import java.util.ArrayList;

public class Dealer {

    static boolean deal = false;
    static boolean deal1 = false;
    static boolean deal2 = false;
    private String dealerID;
    static Card card;
    static ArrayList<Card> hand;
    private static int handvalue = 0;
    private Card[] aHand;

    public Dealer(String dealerID) {
        this.dealerID = dealerID;
    }

    public String getDealerID() {
        return dealerID;
    }

    public static void deal(GroupOfCards deck) {
        if (deal) {
            card = deck.showCards();
            handvalue = card.getValueOfCard();
        }
        if (deal1) {
            card = deck.showCards();
            System.out.println("Delear Hand value is " + card.getValueOfCard());
            handvalue += card.getValueOfCard();
        }
        if (deal2) {
            while (handvalue < 17) {
                card = deck.showCards();
                handvalue += card.getValueOfCard();
            }
        }
    }

}
