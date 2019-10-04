public class Output {

    public static void showResult() {
        if (GameProcessor.getPlayerPoints() < GameProcessor.getComputerPoints()) {
            System.out.println("End of the game!\nSorry - you lost!");
        } else if (GameProcessor.getPlayerPoints() == GameProcessor.getComputerPoints()) {
            System.out.println("End of the game!\nIt's a draw!");
        } else if (GameProcessor.getPlayerPoints() > GameProcessor.getComputerPoints()) {
            System.out.println("End of the game!\nCongratulations - you won!");
        }
    }
}
