import java.util.Scanner;

public class Input {

    private static String name;
    private static int noOfRounds;
    static Scanner input = new Scanner(System.in);


    public static void askForPlayersName() {
        System.out.println("Enter your name: ");
        name = input.nextLine();
    }

    public static void noOfRounds() {
        System.out.println("How many rounds do you want to win before winning the game?");
        noOfRounds = input.nextInt();
    }
}
