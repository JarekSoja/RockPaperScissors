package pl.jarek.rockpaperscissors;

import java.util.Random;

class ComputerPlayer implements Player {

    private static final String NAME = "Computer";
    private int points;
    private Random random = new Random();

    ComputerPlayer() {
        this.points = 0;
    }

    public static String getName() {
        return NAME;
    }

    @Override
    public int getPoints () {
        return this.points;
    }

    @Override
    public void addPoint () {
        this.points++;
    }


    public int getComputerMove(){
        return random.nextInt(2);
    }

    public int getComputerMoveInFive(){
        return random.nextInt(4)+1;
    }
}
