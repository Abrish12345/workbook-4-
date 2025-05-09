package com.pluralsight;

import java.util.Scanner;

public class CardApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for players' names
        System.out.println("Enter player 1 name: ");
        String p1Name = scanner.nextLine();

        System.out.println("Enter player 2 name: ");
        String p2Name = scanner.nextLine();

        // Create the deck and shuffle it
        Deck deck = new Deck();
        deck.shuffle();

        // Deal two cards to each player
        Hand p1Hand = new Hand();
        Hand p2Hand = new Hand();

        p1Hand.deal(deck.deal());
        p1Hand.deal(deck.deal());

        p2Hand.deal(deck.deal());
        p2Hand.deal(deck.deal());

        // Display players' hands and their values
        System.out.println(p1Name + "'s hand: ");
        for (Card card : p1Hand.getCards()) {
            card.flip();  // Flip the card to show its value
            System.out.println(card.getValue() + " of " + card.getSuit());
            card.flip();  // Flip it back down
        }
        System.out.println(p1Name + "'s total: " + p1Hand.getValue());

        System.out.println(p2Name + "'s hand: ");
        for (Card card : p2Hand.getCards()) {
            card.flip();  // Flip the card to show its value
            System.out.println(card.getValue() + " of " + card.getSuit());
            card.flip();  // Flip it back down
        }
        System.out.println(p2Name + "'s total: " + p2Hand.getValue());

        // Determine the winner
        int p1Value = p1Hand.getValue();
        int p2Value = p2Hand.getValue();

        if (p1Value > 21) p1Value = 0; // Bust
        if (p2Value > 21) p2Value = 0; // Bust

        if (p1Value > p2Value) {
            System.out.println(p1Name + " wins!");
        } else if (p2Value > p1Value) {
            System.out.println(p2Name + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}