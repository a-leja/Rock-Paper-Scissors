import java.util.Random;
import java.util.Scanner;

public class GameProcessor {
    private static int playerPoints;
    private static int computerPoints;


    public static void processMoves() {
        System.out.println("Make a pick!");
        System.out.println("\n 1 = rock\n 2 = paper\n 3 = scissors");

        Scanner input = new Scanner(System.in);
        int player = input.nextInt();
        Random random = new Random();
        int computer = random.nextInt(3);

        if (player > 3 ) {
            System.out.println("Please enter a number between 1 - 3");
        } else if (player == computer) {
            System.out.println("It's a draw!");
        } else if (player == 1 ) {
                 if (computer == 2 ) {
                    System.out.println("Paper covers rock. You lose!");
                    computerPoints++;
                } else {
                    System.out.println("Rock breaks scissors! You win!");
                    playerPoints++;
                }
            } else if (player == 2) {
                if (computer == 1) {
                    System.out.println("Paper covers rock. You win!");
                } else if (computer == 3) {
                    System.out.println("Scissors cuts paper! You lose!");
                }
            } else if (player == 3) {
                if (computer == 1) {
                    System.out.println("Rock breaks scissors! You lose!");
                } else if (computer == 2) {
                    System.out.println("Scissors cuts paper! You win!");
                }
            }
        }

    public int getUserPoints() {
        return playerPoints;
    }

    public void setUserPoints(int userPoints) {
        this.playerPoints = userPoints;
    }

    public int getComputerPoints() {
        return computerPoints;
    }

    public void setComputerPoints(int computerPoints) {
        this.computerPoints = computerPoints;
    }
}
