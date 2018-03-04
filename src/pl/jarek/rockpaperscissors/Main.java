package pl.jarek.rockpaperscissors;

public class Main {

    private static void startGame(ProcessorPattern processorPattern){
        processorPattern.gameLogic();
    }

    public static void main(String[] args) {

        int gameMode = Commander.welcomeMenu();

        if (gameMode == 1){
            startGame(new Processor());
        } else {
            startGame(new ProcessorVerFive());
        }
    }
}
