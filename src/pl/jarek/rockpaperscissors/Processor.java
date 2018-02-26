package pl.jarek.rockpaperscissors;

public class Processor {

    private int roundCounter;
    private Commander commander;
    private HumanPlayer humanPlayer = new HumanPlayer();
    private ComputerPlayer computerPlayer = new ComputerPlayer();
    private int[][] results = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
    };

    Processor(){
        this.roundCounter = 0;
        this.commander = new Commander();
    }

    public void run(){
        commander.setPlayerName(humanPlayer);
        int gameMode = commander.welcomeMenu();
        if (gameMode == 2){
            System.out.println("This module is under construction, ETA 6.03.2018.");
        } else if (gameMode == 1){
            this.setRoundCounter(commander.setNumberOfRounds());
        } else System.out.println("Please choose game mode by pressing '1' or '2'. I can't recognize any other command.");
        while (this.roundCounter > 0){
            this.roundCounter--;
            int roundResult = this.setRoundResult(commander.getPlayerMove(),commander.getComputerMove());
            this.addPoints(roundResult);
            commander.announceRoundResult(roundResult);
            commander.showCurrentStats(humanPlayer.getPoints(), computerPlayer.getPoints(),this.getRoundNumber(), humanPlayer.getName());
        }
        commander.announceFinalResults(humanPlayer.getPoints(), computerPlayer.getPoints(), humanPlayer.getName());

    }
    private int setRoundResult(int playerMove, int computerMove) {
        return results[playerMove][computerMove];

    }

    private void setRoundCounter(int numberOfRounds){
        this.roundCounter = numberOfRounds;
    }

    private void addPoints(int roundResult){
        if (roundResult > 0){
            humanPlayer.addPoint();
        } else if (roundResult < 0) {
            computerPlayer.addPoint();
        }
    }
    private int getRoundNumber(){
        return this.roundCounter;
    }
}
