import java.util.Scanner;

public class Input {

    private static String name;
    static int noOfRounds;
    static char playAgainOrEndGame;
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
        System.out.println("Do you want to play again \n- YES - click n \n- QUIT GAME - click x");
        playAgainOrEndGame = input.next().charAt(0);
        if (playAgainOrEndGame == 'n') {
            GameProcessor.setPlayerPoints(0);
            GameProcessor.setComputerPoints(0);
            System.out.println("New game begins");
        } else if (playAgainOrEndGame == 'x') {
            System.out.println("Let's continue the game!");
            System.out.println("It was a good game! See you soon!");
            end = true;
            System.exit(0);
        }
    }

    public static boolean getEnd() {
        return end;
    }
}
