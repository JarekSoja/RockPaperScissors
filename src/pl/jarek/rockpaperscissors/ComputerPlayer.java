package pl.jarek.rockpaperscissors;

public class ComputerPlayer implements Player {

    private String name;
    private int points;

    ComputerPlayer() {
        this.name = "Computer";
        this.points = 0;
    }

    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public int getPoints () {
        return this.points;
    }

    @Override
    public void addPoint () {
        this.points++;
    }
}
