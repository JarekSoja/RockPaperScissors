package pl.jarek.rockpaperscissors;

class ProcessorVerFive extends ProcessorPattern {

    private int[][] results = {
            {0, -1, 0, 0, 1},
            {1, 0, -1, 0, 0},
            {0, 1, 0, -1, 0},
            {0, 0, 1, 0, -1},
            {-1, 0, 0, 1, 0,}
    };

    ProcessorVerFive(int roundCounter, HumanPlayer humanPlayer, ComputerPlayer computerPlayer) {
        super(roundCounter, humanPlayer, computerPlayer);
    }

    int getRoundResult(int playerMove, int computerMove) {
        return results[playerMove][computerMove];
    }

    public void gameLogic(){
        Commander.showInstructions();
        while (roundCounter > 0){
            decrementRoundCounter();
            int roundResult = getRoundResult(Commander.getPlayerMoveInFive(),computerPlayer.getComputerMoveInFive());
            addPoints(roundResult);
            Commander.announceRoundResult(roundResult);
            Commander.showCurrentStats(humanPlayer.getPoints(), computerPlayer.getPoints(), getRoundNumber(), humanPlayer.getName());

        }
        Commander.announceFinalResults(humanPlayer.getPoints(), computerPlayer.getPoints(), humanPlayer.getName());
    }

}
