public class RpsRunner {

    public static void main(String[] args) {

        while (!Input.getEnd()) {
            Input.askForPlayersName();
            Input.noOfRounds();
            System.out.println("Let's start!\n");

            while (GameProcessor.getPlayerPoints() < Input.noOfRounds) {
                GameProcessor.processMoves();
                GameProcessor.getPlayerPoints();
                GameProcessor.getComputerPoints();
            }
            System.out.println("--------- YOU : COMPUTER ---------");
            System.out.println("Current result: " + GameProcessor.getComputerPoints() + " : " + GameProcessor.getComputerPoints());
            System.out.println("End of the game");
            Input.playAgainOrEndGame();
        }
    }
}