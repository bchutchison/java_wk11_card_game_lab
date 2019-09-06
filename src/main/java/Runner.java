import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Deck deck = new Deck();
        Card card = new Card(SuitType.HEARTS, RankType.ACE);
        Dealer dealer = new Dealer();

        System.out.println("How many players would you like to play?");

        String input = scanner.next();
        int players = parseInt(input);

        for(int i = 0; i < players; i++){
            String prompt = String.format("Player %s, enter your name: ", (i + 1));
            System.out.println(prompt);
            String playerName = scanner.next();
            Player player = new Player(playerName);
            dealer.addPlayer(player);
        }







    }
}
