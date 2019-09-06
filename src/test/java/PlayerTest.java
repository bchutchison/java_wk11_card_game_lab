import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;
    Deck deck;


    @Before
    public void before() {
        deck = new Deck();
        player = new Player("Ben");
    }


    @Test
    public void playerRecievesCard() {
        deck.populateDeck();
        deck.shuffleDeck();
        player.receiveCard(deck);
        assertEquals(1, player.amountOfCards());
    }


    @Test
    public void returnValue() {
        deck.populateDeck();
        player.receiveCard(deck);
        assertEquals(1, player.returnValue());
    }

    @Test
    public void getHandToal() {
        deck.populateDeck();
        player.receiveCard(deck);
        player.handTotal();
        assertEquals(1, player.returnValue());

    }

}
