package pl.jarek.rockpaperscissors;

class HumanPlayer implements Player {

    private final String NAME;
    private int points;

    HumanPlayer(String NAME) {
        this.NAME = NAME;
    }

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
