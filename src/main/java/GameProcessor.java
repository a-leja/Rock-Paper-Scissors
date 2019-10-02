import java.util.Random;
import java.util.Scanner;

public class GameProcessor {
    static int playerPoints;
    static int computerPoints;


    public static void processMoves() {
        System.out.println("Make a pick!");
        System.out.println("1 - rock\n2 - paper\n3 - scissors\nn - play again\nx - quit game");

        Scanner input = new Scanner(System.in);
        int player = input.nextInt();
        Random random = new Random();
        int computer = random.nextInt(3);
        Scanner continueOrQuit = new Scanner(System.in);
        char choice = continueOrQuit.next().charAt(0);

        if (choice == 'n' || choice == 'x') {
            Input.playAgainOrEndGame();
        } else {
            if (player < 1 || player > 3) {
                System.out.println("Please enter a number between 1 - 3");
            } else if (player == computer) {
                System.out.println("It's a draw!");
                playerPoints++;
                computerPoints++;
            } else if (player == 1) {
                if (computer == 2) {
                    System.out.println("Paper covers rock - you lose!");
                    computerPoints++;
                } else {
                    System.out.println("Rock breaks scissors - you win!");
                    playerPoints++;
                }
            } else if (player == 2) {
                if (computer == 1) {
                    System.out.println("Paper covers rock - you win!");
                    playerPoints++;
                } else if (computer == 3) {
                    System.out.println("Scissors cuts paper - you lose!");
                    computerPoints++;
                }
            } else if (player == 3) {
                if (computer == 1) {
                    System.out.println("Rock breaks scissors - you lose!");
                    computerPoints++;
                } else if (computer == 2) {
                    System.out.println("Scissors cuts paper - you win!");
                    playerPoints++;
                }
            }
            System.out.println("--------------- YOU : COMPUTER ---------------");
            System.out.println("Current result:   " + playerPoints + " : " + computerPoints);
        }
    }

    public static int getPlayerPoints() {
        return playerPoints;
    }

    public static int setPlayerPoints(int setPlayerPoints) {
        setPlayerPoints = playerPoints;
        return playerPoints;
    }

    public static int getComputerPoints() {
        return computerPoints;
    }

    public static int setComputerPoints(int setComputerPoints) {
        setComputerPoints = computerPoints;
        return computerPoints;
    }
}
