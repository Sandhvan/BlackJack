/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author vansh
 */
public class Test {

    public static void main(String[] args) {
        GroupOfCards deck = new GroupOfCards(52);
        Card card = deck.showCards();
        System.out.println(card.getValueOfCard());
        deck.shuffle();
        card = deck.showCards();
        System.out.println(card.getValueOfCard());
    }
}
