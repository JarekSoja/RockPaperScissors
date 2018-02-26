package pl.jarek.rockpaperscissors;

public class Processor {

    private int playerPoints;
    private int computerPoints;
    private int roundCounter;
    private
    private int[][] results = {
            {0, -1, 1},
            {1, 0, -1},
            {-1, 1, 0}
    };

    public Processor(int rounds){
        this.playerPoints = 0;
        this.computerPoints = 0;
        this.roundCounter = rounds;
    }

    public void run(){

    }

    private int setRoundResult(int playerMove, int computerMove) {
        int result = results[playerMove][computerMove];
        return result;
    }

    public void setRoundCounter(int numberOfRounds){
        this.roundCounter = numberOfRounds;

    }

    private void substractRoundCounter(){
        this.roundCounter--;
    }

    public int getPlayerMove(){

    }
}
