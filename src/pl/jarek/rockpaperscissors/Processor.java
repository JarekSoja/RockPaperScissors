package pl.jarek.rockpaperscissors;

public class Processor extends ProcessorPattern {

    private int[][] results = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
    };

    public void gameLogic(){
        this.startingSettings();
        while (this.roundCounter > 0){
            this.roundCounter--;
            int roundResult = this.setRoundResult(commander.getPlayerMove(),computerPlayer.getComputerMove());
            this.addPoints(roundResult);
            this.commander.announceRoundResult(roundResult);
            this.commander.showCurrentStats(humanPlayer.getPoints(), computerPlayer.getPoints(), this.getRoundNumber(), humanPlayer.getName());
        }
        this.commander.announceFinalResults(humanPlayer.getPoints(), computerPlayer.getPoints(), humanPlayer.getName());
    }


    int setRoundResult(int playerMove, int computerMove) {
        return results[playerMove][computerMove];
    }
}
