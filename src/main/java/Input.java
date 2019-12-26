import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Input {
    private static String name;
    static char choice;
    static int noOfRounds;
    static String playAgainOrEndGame;
    static boolean end = false;
    static Scanner input = new Scanner(System.in);

    public static void askForPlayersName() {
        System.out.println("Enter your name: ");
        name = input.nextLine();
    }

    public static void noOfRounds() {
        System.out.println("How many rounds do you want to win before winning the game?");
        noOfRounds = input.nextInt();
    }

    public static void playAgainOrEndGame() {
        System.out.println("\n Do you want to play again? \n- YES - click n \n- QUIT GAME - click x");
        try {
            char choice = verifyChoice();
        } catch (Exception e) {
            throw new NumberFormatException();
        }
        if (choice == 'n') {
            GameProcessor.setPlayerPoints(0);
            GameProcessor.setComputerPoints(0);
            end = false;
            System.out.println("Let's continue the game!");
            System.out.println("New game begins...");
        } else if (choice == 'x') {
            System.out.println("It was a good game! See you soon!");
            end = true;
            System.exit(0);
        } else {
            System.out.println("Please enter either \"n\" or \"x\"");
            playAgainOrEndGame();
        }
    }

    public static char verifyChoice() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return choice = (char) br.read();
    }

    public static int getNoOfRounds() {
        return noOfRounds;
    }

    public static boolean getEnd() {
        return end;
    }
}
