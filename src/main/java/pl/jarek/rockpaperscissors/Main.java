package pl.jarek.rockpaperscissors;

public class Main {

    private static void startGame(ProcessorPattern processorPattern){
        processorPattern.gameLogic();
    }

    public static void main(String[] args) {

        int gameMode = Commander.welcomeMenu();
        if (gameMode == 1){
            String playerName = Commander.createNewPlayer();
            int roundCount = Commander.getNumberOfRounds();
            startGame(new Processor(roundCount, new HumanPlayer(playerName), new ComputerPlayer()));
        } else {
            String playerName = Commander.createNewPlayer();
            int roundCount = Commander.getNumberOfRounds();
            startGame(new ProcessorVerFive(roundCount, new HumanPlayer(playerName), new ComputerPlayer()));
        }
    }
}
