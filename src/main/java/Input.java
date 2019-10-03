import java.util.Scanner;

public class Input {

    private static String name;
    static int noOfRounds;
    static String playAgainOrEndGame;
    static boolean end = false;
    static Scanner input = new Scanner(System.in);
//    static int min = Integer.MIN_VALUE;

    public static void askForPlayersName() {
        System.out.println("Enter your name: ");
        name = input.nextLine();
    }

    public static void noOfRounds() {
        System.out.println("How many rounds do you want to win before winning the game?");
        noOfRounds = input.nextInt();
//        if (noOfRounds != min) {
//            System.out.println("Please enter a number");
//        } else {
//            return noOfRounds;
//        }

    }

    public static void playAgainOrEndGame() {
        System.out.println("\n Do you want to play again? \n- YES - click n \n- QUIT GAME - click x");
        playAgainOrEndGame = input.nextLine();
        if (playAgainOrEndGame.equals("n")) {
            end = false;
            GameProcessor.setPlayerPoints(0);
            GameProcessor.setComputerPoints(0);
            System.out.println("Let's continue the game!");
            System.out.println("New game begins");
        } else if (playAgainOrEndGame.equals("x")) {
            System.out.println("It was a good game! See you soon!");
            end = true;
            System.exit(0);
        }
    }

    public static int getNoOfRounds() {
        return noOfRounds;
    }

    public static String getPlayAgainOrEndGame() {
        return playAgainOrEndGame;
    }

    public static boolean getEnd() {
        return end;
    }
}
