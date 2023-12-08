package week6DeckCards;

public class Deck {
    private Card cards[] = new Card[52];

    public Deck() {
        int i = 0;
        /*
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[i] = new Card(rank, suit);
                i++;
            }
        }
        */
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards[i] = new Card(rank, suit);
                i++;
            }
        }
    }

    public Card[] getCards() {
        return cards;
    }
}
