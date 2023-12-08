package week6DeckCards;

public class Main {
    public static void main(String[] args) {


        Deck deck = new Deck();
        Card[] cards = deck.getCards();

        for (Card card : cards) {
            //System.out.println(card.getValue() + " " + card.toString());
            System.out.println(card.toString());
        }


    }
}
