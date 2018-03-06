package pl.jarek.rockpaperscissors;

public class Processor extends ProcessorPattern {

    private int[][] results = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
    };

    Processor(int roundCounter, HumanPlayer humanPlayer, ComputerPlayer computerPlayer) {
        super(roundCounter, humanPlayer, computerPlayer);
    }

    public void gameLogic(){
        while (roundCounter > 0){
            decrementRoundCounter();
            int playerMove = Commander.getPlayerMove();
            int computerMove = computerPlayer.getComputerMove();
            int roundResult = getRoundResult(playerMove, computerMove);
            addPoints(roundResult);
            Commander.announceRoundResult(roundResult);
            Commander.showCurrentStats(humanPlayer.getPoints(), computerPlayer.getPoints(), this.getRoundNumber(), humanPlayer.getName());
        }
        Commander.announceFinalResults(humanPlayer.getPoints(), computerPlayer.getPoints(), humanPlayer.getName());
    }
    int getRoundResult(int playerMove, int computerMove) {
        return results[playerMove][computerMove];
    }
}
