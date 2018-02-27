package pl.jarek.rockpaperscissors;

import java.util.Random;

public class ComputerPlayer implements Player {

    private final String NAME;
    private int points;
    private Random random = new Random();

    ComputerPlayer() {
        this.NAME = "Computer";
        this.points = 0;
    }

    @Override
    public String getName() {
        return this.NAME;
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
}
