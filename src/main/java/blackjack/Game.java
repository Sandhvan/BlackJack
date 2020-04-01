/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package blackjack;

import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods given.
 *
 * @author dancye, 2018
 */
public class Game {

    static GroupOfCards deck = new GroupOfCards(52 * 4);

    /**
     * Play the game. This might be one method or many method calls depending on
     * your game.
     */
    public static void play() {
        boolean keepGoing = true;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter Your Player Id ");
            Player p = new Player(input.next());
            System.out.println("Shall we start game yes/no");
            String str = input.next();
            if (str.equalsIgnoreCase("yes")) {
                Player.playerdeal = true;
                Player.play(deck);
                Player.playerdeal = false;
                Dealer.deal = true;
                Dealer.deal(deck);
                Dealer.deal = false;
                Player.playerdeal2 = true;
                Player.play(deck);
                Player.playerdeal2 = false;
                Dealer.deal1 = true;
                Dealer.deal(deck);
                Dealer.deal1 = false;
                Dealer.deal2 = true;
                Dealer.deal(deck);
                System.out.println("Delear hand " + Dealer.handvalue);
                declareWinner();
            } else {
                System.out.println("Thank you Joining you may leave now");
            }
            System.out.println("Press 1 to continue game or 0 to not");
            String userAnswer = input.next();
            if (Integer.parseInt(userAnswer) != 1) {
                keepGoing = false;
            }
        } while (keepGoing);
        System.out.println("Thank you Joining you may leave now");

    }

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public static void declareWinner() {

    }

    public static void main(String[] args) {
        play();
    }
}//end class
