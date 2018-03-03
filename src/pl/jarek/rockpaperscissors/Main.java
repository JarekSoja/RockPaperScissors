package pl.jarek.rockpaperscissors;

public class Main {

    public static void main(String[] args) {
        ProcessorPattern game;
        Commander commander = new Commander();
        int gameMode = commander.welcomeMenu();

        if (gameMode == 1){
            game = new Processor();
        } else {
            game = new ProcessorVerFive();
        }
        game.gameLogic();
    }
}
