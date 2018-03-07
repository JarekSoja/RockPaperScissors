package pl.jarek.rockpaperscissors;

import java.util.Random;

class ComputerPlayer implements Player {

    private static final String NAME = "Computer";
    private int points;
    private Random random = new Random();
    private Cheater cheater;
    private int[] results = {1, 2, 0};
    private int[] resultsInFive = {1, 2, 3, 4, 0};


    ComputerPlayer(Cheater cheater) {
        this.points = 0;
        this.cheater = cheater;
    }

    public static String getName() {
        return NAME;
    }

    public int getPoints () {
        return this.points;
    }

    public void addPoint () {
        this.points++;
    }

    public int getComputerMove(int playerMove) {
        if (!cheater.isCheatingInClassicVersion()) {
            return random.nextInt(2);
        } else {
            boolean isCheatingThisRound = random.nextBoolean();
            if (isCheatingThisRound) {
                return results[playerMove];
            } else {
                return random.nextInt(2);
            }
        }
    }

    public int getComputerMoveInFive(int playerMove){
        if (!cheater.isCheatingInFiveVersion()) {
            return random.nextInt(4);
        } else {
            boolean isCheatingThisRound = random.nextBoolean();
            if (isCheatingThisRound) {
                return resultsInFive[playerMove];
            } else {
                return random.nextInt(4);
            }
        }
    }
}
