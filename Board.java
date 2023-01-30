import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.*;
import java.util.Iterator; 
public class Board {

    static int numCards;
    public static Player[] players;
    
    

    public static void populate() {
        Random rand = new Random(); 
        numCards = rand.nextInt(41)+10; 
    }

    public static void addPlayers(int numPlayers) {
        Scanner myObj = new Scanner(System.in); 
        Player[] player = new Player[numPlayers];
        for (int i=0; i<numPlayers; i++) {
            System.out.println("Please enter player " + (i+1) + "'s name: ");
            String playerNameString = myObj.nextLine();
            player[i] = new Player();
            player[i].addName(playerNameString);
            
        }
        while (true) {
            for (Player p : player) {
                if (numCards == 1) {
                    break; 
                }
                System.out.println("This is how many cards you have " + p.playerName + ": " + Board.numCards);
                p.play();
            }
            if (numCards == 1) {
                System.out.println("END GAME");
                break; 
            }
        }
    }

    public static boolean isValid(int cardInput) {
        if ((cardInput <= (numCards/2)) && (cardInput >=1)){
            return true; 
        }
        return false;
    }

    //}   
}
