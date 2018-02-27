package pl.jarek.rockpaperscissors;

public class HumanPlayer implements Player {

    private final String NAME;
    private int points;

    public HumanPlayer(String NAME) {
        this.NAME = NAME;
    }

    @Override
    public String getName() {
        return this.NAME;
    }

    @Override
    public int getPoints() {
        return this.points;
    }

    @Override
    public void addPoint() {
        this.points++;
    }
}
