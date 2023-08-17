package ca.sheridancollege.project;

public class Game {
    private final Player player;
    private final Player dealer;
    private final Deck deck;

    public Game(String playerName) {
        this.player = new Player(playerName);
        this.dealer = new Player("Dealer");
        this.deck = new Deck();
    }

    public void start() {
        player.draw(deck);
        dealer.draw(deck);
        player.draw(deck);
        dealer.draw(deck);

        System.out.println(player.getName() + " Score: " + player.getScore());
        System.out.println(dealer.getName() + " Score: " + dealer.getScore());

        if (player.getScore() > dealer.getScore()) {
            System.out.println(player.getName() + " wins!");
        } else if (player.getScore() < dealer.getScore()) {
            System.out.println(dealer.getName() + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
