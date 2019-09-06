import java.util.ArrayList;
import java.util.HashMap;

public class Card {

    private SuitType suit;
    private RankType rank;
    //hashmap example
    private String name;
    private HashMap<String, Integer> hash; //type of thing as key and value within arrows

    public Card(SuitType suit, RankType rank){
        this.suit = suit;
        this.rank = rank;

        //hashmap example
        this.name = name;
        this.hash = new HashMap<String, Integer>();
    }

    public SuitType getSuit() {
        return suit;
    }

    public void setSuit(SuitType suit) {
        this.suit = suit;
    }

    public RankType getRank() {
        return rank;
    }

    public void setRank(RankType rank) {
        this.rank = rank;
    }


    //hashmap
    public void addToHashMap(String key, Integer value){
        hash.put(key, value);
        hash.clear();
        hash.containsKey(key); //chacks if key exists
        hash.remove(key); //removes specific key
    }

}




//for loop
//for(int i = 0; i < array.size(); i++) {   //counter | boolean | increment
//    do this for each interation
//        }


//for (String time:times) {
//    System.out.println(time);
//        }


//for (String day:days) {
//    for (String time:times) {
//        System.out.println(day);
//        }
//    }



