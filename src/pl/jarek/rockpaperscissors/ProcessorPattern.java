package pl.jarek.rockpaperscissors;

abstract class ProcessorPattern {

    int roundCounter;
    HumanPlayer humanPlayer;
    ComputerPlayer computerPlayer;

    int getRoundNumber(){
        return this.roundCounter;
    }

    void startingSettings(){
        this.humanPlayer = new HumanPlayer(Commander.createNewPlayer());
        this.computerPlayer = new ComputerPlayer();
        this.roundCounter = Commander.setNumberOfRounds();
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
