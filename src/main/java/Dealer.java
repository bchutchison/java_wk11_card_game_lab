import java.util.ArrayList;

public class Dealer {

        ArrayList<Player> players;

    public Dealer() {
        this.players = new ArrayList<Player>();

    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public int playerCount(){
        return this.players.size();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void drawCardsForPlayer(Player player, Deck deck) {
        player.receiveCard(deck);
    }

    public String checkForWinningCard(Player player1, Player player2) {
        if(player1.returnValue() > player2.returnValue())  {
            return "player1";
        } else if (player1.returnValue() < player2.returnValue()) {
            return "player2";
        } else {
            return "draw!";
        }
    }
}
