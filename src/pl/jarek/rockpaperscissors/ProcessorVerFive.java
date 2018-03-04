package pl.jarek.rockpaperscissors;

class ProcessorVerFive extends ProcessorPattern {

    private int[][] results = {
            {0, -1, 0, 0, 1},
            {1, 0, -1, 0, 0},
            {0, 1, 0, -1, 0},
            {0, 0, 1, 0, -1},
            {-1, 0, 0, 1, 0,}
    };

    int setRoundResult(int playerMove, int computerMove) {
        return results[playerMove][computerMove];
    }

    public void gameLogic(){
        startingSettings();
        Commander.showInstructions();
        while (roundCounter > 0){
            roundCounter--;
            int roundResult = setRoundResult(Commander.getPlayerMoveInFive(),computerPlayer.getComputerMoveInFive());
            addPoints(roundResult);
            Commander.announceRoundResult(roundResult);
            Commander.showCurrentStats(humanPlayer.getPoints(), computerPlayer.getPoints(), getRoundNumber(), humanPlayer.getName());

        }
        Commander.announceFinalResults(humanPlayer.getPoints(), computerPlayer.getPoints(), humanPlayer.getName());
    }

}
