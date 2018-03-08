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
            int computerMove = computerPlayer.getComputerMove(playerMove);
            int roundResult = getRoundResult(playerMove, computerMove);
            addPoints(roundResult);
            Commander.announceRoundResult(roundResult);
            Commander.showCurrentStats(humanPlayer.getPoints(), computerPlayer.getPoints(), this.getRoundNumber(), humanPlayer.getName());
        }
        Commander.announceFinalResults(humanPlayer.getPoints(), computerPlayer.getPoints(), humanPlayer.getName());
        if (Commander.nextRound() == 'y'){
                roundCounter = Commander.getNumberOfRounds();
                gameLogic();
        }
    }

    int getRoundResult(int playerMove, int computerMove) {
        return results[playerMove][computerMove];
    }
}
