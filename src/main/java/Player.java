import java.util.ArrayList;

public class Player {

    private ArrayList<Card> dealtCard;
    private String name;

    public Player(String name) {
        this.dealtCard = new ArrayList<Card>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int returnValue() {
        return dealtCard.get(0).getRank().getValue();
    }


    public int amountOfCards() {
        return dealtCard.size();
    }


    public void receiveCard(Deck deck) {
        Card card = deck.dealCard();
        this.dealtCard.add(card);
    }

    public int handTotal() {
        this.dealtCard
    }
}
