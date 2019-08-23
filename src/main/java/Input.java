import java.util.Scanner;

public class Input {

    private static String name;
    private static int noOfRounds;
    private static char playAgain;
    private static char endGame;
    static Scanner input = new Scanner(System.in);


    public static void askForPlayersName() {
        System.out.println("Enter your name: ");
        name = input.nextLine();
    }

    public static void noOfRounds() {
        System.out.println("How many rounds do you want to win before winning the game?");
        noOfRounds = input.nextInt();
    }

    public static void playAgain() {
        playAgain = input.next().charAt(0);
        if (playAgain == 'x') {
            System.out.println("Do you really want to play again \n- YES - click x \n- NO - cancel");
            Input.playAgain();
            if (playAgain == 'x') {
                GameProcessor.setPlayerPoints(0);
                GameProcessor.setComputerPoints(0);
            } else {
                System.out.println("Let's continue the game!");
            }
        }
    }

    public static void endGame() {
        System.out.println("Are you sure you want to end this game?");
        endGame = input.next().charAt(0);
        if (endGame == 'x') {
            System.out.println("It was a good game! See you soon!");
        }
    }
}
