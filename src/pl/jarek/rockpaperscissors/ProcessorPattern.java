package pl.jarek.rockpaperscissors;

abstract class ProcessorPattern {

    int roundCounter;
    Commander commander;
    HumanPlayer humanPlayer;
    ComputerPlayer computerPlayer;

    int getRoundNumber(){
        return this.roundCounter;
    }

    void startingSettings(){
        this.commander = new Commander();
        this.humanPlayer = new HumanPlayer(commander.createNewPlayer());
        this.computerPlayer = new ComputerPlayer();
        this.roundCounter = commander.setNumberOfRounds();
    }

    void addPoints(int roundResult){
        if (roundResult > 0) {
            humanPlayer.addPoint();
        }
        else if (roundResult < 0) {
            computerPlayer.addPoint();
        } else System.out.println("No points added.");
    }

    abstract int setRoundResult(int playerMove, int computerMove);

    abstract void gameLogic();

}
