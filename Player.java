import java.util.Scanner;
public class Player {
    String playerName; 

    public void addName(String name) {
        playerName = name;
    }

    public void play() {
        System.out.println("How many cards would you like to take " + playerName + "?");
        Scanner scanner = new Scanner(System.in);
        String inputCardsString = scanner.nextLine();
        int cardInput = Integer.parseInt(inputCardsString);
        if (Board.isValid(cardInput)) {
            Board.numCards -= cardInput;
        } else {
            System.out.println("Please enter a valid move " + playerName);
        }
    }

}

