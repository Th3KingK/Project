package ca.sheridancollege.project;

import java.util.Scanner;

public class Game {
    private final Player player;
    private final Player dealer;
    private final Deck deck;
    private final Scanner scanner;

    public Game(String playerName) {
        this.player = new Player(playerName);
        this.dealer = new Player("Dealer");
        this.deck = new Deck();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        player.draw(deck);
        dealer.draw(deck);
        player.draw(deck);
        dealer.draw(deck);

        boolean playerTurn = true;
        while(playerTurn) {
            System.out.println(player.getName() + " Score: " + player.getScore());
            System.out.println("Do you want to hit? (yes/no)");
            String input = scanner.nextLine();
            if(input.toLowerCase().equals("yes")) {
                player.draw(deck);
                if(player.getScore() > 21) {
                    playerTurn = false;
                    System.out.println(player.getName() + " Score: " + player.getScore());
                    System.out.println("Bust! " + player.getName() + " has lost.");
                }
            } else {
                playerTurn = false;
            }
        }

        if(player.getScore() <= 21) {
            while(dealer.getScore() < 17) {
                dealer.draw(deck);
            }
            System.out.println(dealer.getName() + " Score: " + dealer.getScore());
            
            if (dealer.getScore() > 21 || player.getScore() > dealer.getScore()) {
                System.out.println(player.getName() + " wins!");
            } else if (player.getScore() < dealer.getScore()) {
                System.out.println(dealer.getName() + " wins!");
            } else {
                System.out.println("It's a tie!");
            }
        }
    }
}
