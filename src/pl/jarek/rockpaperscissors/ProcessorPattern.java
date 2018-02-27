package pl.jarek.rockpaperscissors;

abstract class ProcessorPattern {

    int roundCounter;
    Commander commander;
    HumanPlayer humanPlayer;
    ComputerPlayer computerPlayer;

    int getRoundNumber(){
        return this.roundCounter;
    }

    void setRoundCounter(int numberOfRounds){
        this.roundCounter = numberOfRounds;
    }

    abstract int setRoundResult(int playerMove, int computerMove);

    abstract void game();

    abstract void addPoints(int roundResult);
}
