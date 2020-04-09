package blackjack;

public class Dealer {

    static boolean deal = false;
    static boolean deal1 = false;
    static boolean deal2 = false;
    private String dealerID;
    static Card card;
    static int handvalue = 0;

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
            System.out.println("Delear Total Hand value is " + card.getValueOfCard());
        }
        if (deal1) {
            card = deck.showCards();
            handvalue += card.getValueOfCard();
        }
        if (deal2) {
            while (handvalue <= 17) {
                card = deck.showCards();
                handvalue += card.getValueOfCard();

            }
        }
        if (handvalue > 28) {
            handvalue = 27;
        }
    }

}
