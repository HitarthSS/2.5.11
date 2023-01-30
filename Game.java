import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        
    }

    public void play() { 
        Scanner myObj = new Scanner(System.in); 
        System.out.println("How many people will be playing? ");
        String numPlayersString = myObj.nextLine();
        int numPlayers = Integer.valueOf(numPlayersString);
        System.out.println("This is how many players are playing: " + numPlayers);
        Board.addPlayers(numPlayers);
    }

    
}
