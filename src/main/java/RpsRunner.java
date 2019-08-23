public class RpsRunner {

    public static void main(String[] args) {

        while (!Input.end) {
            Input.askForPlayersName();
            Input.noOfRounds();
            System.out.println("Let's start!\n");

            while (GameProcessor.getPlayerPoints() < Input.noOfRounds) {
                GameProcessor.processMoves();
                GameProcessor.getPlayerPoints();
                GameProcessor.getComputerPoints();
            }
        }
    }
}