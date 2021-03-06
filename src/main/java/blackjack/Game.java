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

    private static GroupOfCards deck = new GroupOfCards(52 * 4);
    private static int points;
    private static int winCount = 0;
    private static int gamePlayed = 0;

    /**
     * Play the game. This might be one method or many method calls depending on
     * your game.
     */
    public static void play() {
        boolean keepGoing = true;
        Scanner input = new Scanner(System.in);

        do {

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
            System.out.println("Your points " + points);
            System.out.println("\nPress 1 to continue game or 0 to not");
            String userAnswer = input.next();
            if (Integer.parseInt(userAnswer) != 1) {
                keepGoing = false;
            }
        } while (keepGoing);
        System.out.println("\n#Your total pionts are " + points);
        System.out.println("#Number of Game Played " + gamePlayed);
        System.out.println("#Number of time you won " + winCount);
        System.out.println("#Thank you for Joining");

    }

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public static void declareWinner() {
        gamePlayed++;
        if (Dealer.handvalue <= 21 && Dealer.handvalue > Player.handvalue) {
            System.out.println("You Lose and Dealer Win");
        } else if (Dealer.handvalue == Player.handvalue) {
            System.out.println("Its a tie");
        } else if (Dealer.handvalue > 21 && Player.handvalue < Dealer.handvalue
                && Player.handvalue <= 21) {
            System.out.println("You win and Dealer Lose");
            points += 5;
            winCount++;
        } else if (Dealer.handvalue > 21 && Player.handvalue > 21) {
            System.out.println("No one wins");
        } else if (Player.handvalue > 21 && Dealer.handvalue <= 21) {
            System.out.println("You Lose and Dealer Win");
        } else if (Dealer.handvalue <= 21 && Player.handvalue <= 21
                && Dealer.handvalue < Player.handvalue) {
            System.out.println("You win and Dealer Lose");
            points += 5;
            winCount++;
        }
    }

    public static void main(String[] args) {
        System.out.println("#This Game is a simple Black Jack game\n   "
                + "for beginner to learn without losing Money.");
        System.out.println("#This game does not promot betting and\n  "
                + " there is no involvement of any money.");
        System.out.println("#This game work on simple point you earn when you win.");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Player Id ");
        Player p = new Player(input.next());
        System.out.println("Shall we start game yes/no");
        String str = input.next();
        if (str.equalsIgnoreCase("yes")) {
            play();
        } else {
            System.out.println("Thank you for Joining");
        }
    }
}//end class
