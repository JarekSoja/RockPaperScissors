package pl.jarek.rockpaperscissors;

public class Main {

    private static void startGame(ProcessorPattern processorPattern) {
        processorPattern.gameLogic();
    }

    public static void main(String[] args) {
        YamlReader yamlReader = new YamlReader();
        String playerName = Commander.createNewPlayer();

        int gameMode = Commander.welcomeMenu();
        if (gameMode == 1) {
            int roundCount = Commander.getNumberOfRounds();
            startGame(new Processor(roundCount, new HumanPlayer(playerName), new ComputerPlayer(yamlReader.reader())));
        } else {
            int roundCount = Commander.getNumberOfRounds();
            startGame(new ProcessorVerFive(roundCount, new HumanPlayer(playerName), new ComputerPlayer(yamlReader.reader())));
        }
    }
}
