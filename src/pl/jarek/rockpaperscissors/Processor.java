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
            int roundResult = this.setRoundResult(Commander.getPlayerMove(),computerPlayer.getComputerMove());
            this.addPoints(roundResult);
            Commander.announceRoundResult(roundResult);
            Commander.showCurrentStats(humanPlayer.getPoints(), computerPlayer.getPoints(), this.getRoundNumber(), humanPlayer.getName());
        }
        Commander.announceFinalResults(humanPlayer.getPoints(), computerPlayer.getPoints(), humanPlayer.getName());
    }


    int setRoundResult(int playerMove, int computerMove) {
        return results[playerMove][computerMove];
    }
}
