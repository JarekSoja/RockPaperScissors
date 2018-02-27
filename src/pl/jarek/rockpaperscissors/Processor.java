package pl.jarek.rockpaperscissors;

public class Processor extends ProcessorPattern {

    private int[][] results = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
    };

    public void game(){
        this.commander = new Commander();
        this.humanPlayer = new HumanPlayer(commander.createNewPlayer());
        this.computerPlayer = new ComputerPlayer();
        int gameMode = commander.welcomeMenu();
        if (gameMode == 2){
            System.out.println("This module is under construction, ETA 6.03.2018.");
        } else if (gameMode == 1){
            this.setRoundCounter(commander.setNumberOfRounds());
        } else System.out.println("Please choose game mode by pressing '1' or '2'. I can't recognize any other command.");
        while (this.roundCounter > 0){
            this.roundCounter--;
            int roundResult = this.setRoundResult(commander.getPlayerMove(),computerPlayer.getComputerMove());
            this.addPoints(roundResult);
            this.commander.announceRoundResult(roundResult);
            this.commander.showCurrentStats(humanPlayer.getPoints(), computerPlayer.getPoints(), this.getRoundNumber(), humanPlayer.getName());
        }
        this.commander.announceFinalResults(humanPlayer.getPoints(), computerPlayer.getPoints(), humanPlayer.getName());
    }

    void addPoints(int roundResult){
        if (roundResult > 0) {
            humanPlayer.addPoint();
        }
        else if (roundResult < 0) {
            computerPlayer.addPoint();
        } else System.out.println("No points added.");
    }

    int setRoundResult(int playerMove, int computerMove) {
        return results[playerMove][computerMove];
    }
}
