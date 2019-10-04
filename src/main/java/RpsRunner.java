public class RpsRunner {

    public static void main(String[] args) {

        Input.askForPlayersName();
        while (!Input.getEnd()) {
            Input.noOfRounds();
            System.out.println("Let's start!\n");

            while (GameProcessor.getPlayerPoints() < Input.getNoOfRounds()) {
                GameProcessor.processMoves();
                GameProcessor.getPlayerPoints();
                GameProcessor.getComputerPoints();
            }
            Output.showResult();
            Input.playAgainOrEndGame();
        }
    }
}