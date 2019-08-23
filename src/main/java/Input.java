import java.util.Scanner;

public class Input {

    private static String name;
    static int noOfRounds;
    private static char playAgain;
    private static char endGame;
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

    public static void playAgain() {
        playAgain = input.next().charAt(0);
        if (playAgain == 'x') {
            System.out.println("Do you want to play again \n- YES - click x \n- NO - cancel");
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
            end = true;
            System.exit(0);
        }
    }
}
