public class RpsRunner {

    public static void main(String[] args) {

        while (!Input.getEnd()) {
            Input.askForPlayersName();
            Input.noOfRounds();
            System.out.println("Let's start!\n");

            while (GameProcessor.getPlayerPoints() < Input.getNoOfRounds()) {
                GameProcessor.processMoves();
                GameProcessor.getPlayerPoints();
                GameProcessor.getComputerPoints();
            }
            System.out.println("End of the game!");
            Input.playAgainOrEndGame();
        }
    }
}