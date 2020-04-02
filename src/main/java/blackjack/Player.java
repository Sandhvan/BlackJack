/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package blackjack;

import java.util.Scanner;

/**
 * A class that models each Player in the game. Players have an identifier,
 * which should be unique.
 *
 * @author dancye, 2018
 */
public class Player {

    static boolean playerdeal = false;
    static boolean playerdeal1 = false;
    static boolean playerdeal2 = false;
    private String playerID; //the unique ID for this player
    static Card card;
    static int handvalue = 0;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        playerID = name;
    }

    /**
     * @return the playerID
     */
    public String getPlayerID() {
        return playerID;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param givenID the playerID to set
     */
    public void setPlayerID(String givenID) {
        playerID = givenID;
    }

    public static void play(GroupOfCards deck) {
        if (playerdeal) {
            card = deck.showCards();
            handvalue = card.getValueOfCard();
            System.out.println("Your total hand value is " + handvalue);
        }
        Scanner sc = new Scanner(System.in);
        boolean keepGoing = true;
        if (playerdeal2) {
            do {
                card = deck.showCards();
                handvalue += card.getValueOfCard();
                System.out.println("Your total hand is value " + handvalue);
                System.out.println("Press 1 to draw another card or 0 to not");
                String userAnswer = sc.nextLine();
                if (Integer.parseInt(userAnswer) != 1) {
                    keepGoing = false;
                }
            } while (keepGoing);
        }
    }
}
