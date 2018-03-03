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
        this.startingSettings();
        this.commander.showInstructions();
        while (this.roundCounter > 0){
            this.roundCounter--;
            int roundResult = this.setRoundResult(commander.getPlayerMoveInFive(),computerPlayer.getComputerMoveInFive());
            this.addPoints(roundResult);
            this.commander.announceRoundResult(roundResult);
            this.commander.showCurrentStats(humanPlayer.getPoints(), computerPlayer.getPoints(), this.getRoundNumber(), humanPlayer.getName());
        }
        this.commander.announceFinalResults(humanPlayer.getPoints(), computerPlayer.getPoints(), humanPlayer.getName());
    }

}
