package pl.jarek.rockpaperscissors;

abstract class ProcessorPattern {

    int roundCounter;
    HumanPlayer humanPlayer;
    ComputerPlayer computerPlayer;

    int getRoundNumber() {
        return this.roundCounter;
    }

    ProcessorPattern(int roundCounter, HumanPlayer humanPlayer, ComputerPlayer computerPlayer) {
        this.roundCounter = roundCounter;
        this.humanPlayer = humanPlayer;
        this.computerPlayer = computerPlayer;
    }

    void addPoints(int roundResult) {
        if (roundResult > 0) {
            humanPlayer.addPoint();
        } else if (roundResult < 0) {
            computerPlayer.addPoint();
        } else System.out.println("No points added.");
    }

    void decrementRoundCounter() {
        roundCounter--;
    }

    abstract int getRoundResult(int playerMove, int computerMove);

    abstract void gameLogic();

}
