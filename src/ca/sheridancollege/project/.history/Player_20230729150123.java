package ca.sheridancollege.project;

public class Player {
    private final String name;
    private int score = 0;
    private Card drawnCard;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void draw(Deck deck) {
        this.drawnCard = deck.draw();
        score += calculateCardValue(drawnCard);
        System.out.println(name + " draws " + drawnCard.toString());
    }

    public int getScore() {
        return score;
    }

    private int calculateCardValue(Card card) {
        switch (card.getRank()) {
            case ACE: return 11;
            case TWO: return 2;
            case THREE: return 3;
            case FOUR: return 4;
            case FIVE: return 5;
            case SIX: return 6;
            case SEVEN: return 7;
            case EIGHT: return 8;
            case NINE: return 9;
            case TEN:
            case JACK:
            case QUEEN:
            case KING:
                return 10;
            default: return 0;
        }
    }
}
