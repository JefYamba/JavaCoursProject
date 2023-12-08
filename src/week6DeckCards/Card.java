package week6DeckCards;

public class Card {
    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.rank.getValue();
    }

    @Override
    public String toString(){
        //return this.rank + " " +  this.suit;
        return this.getValue() + " " +this.rank + " " +  this.suit;
    }
}
