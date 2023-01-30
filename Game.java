import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        
    }

    public void play() { 
        System.out.println("You will be given a random amount of cards, who ever ends up with only 1 card at the end of their turn WINS!");
        System.out.println("NOTE: You must take at least 1 card but you can't take more than half!");
        Scanner myObj = new Scanner(System.in); 
        System.out.println("How many people will be playing? ");
        String numPlayersString = myObj.nextLine();
        int numPlayers = Integer.valueOf(numPlayersString);
        System.out.println("This is how many players are playing: " + numPlayers);
        Board.addPlayers(numPlayers);
    }

    
}
