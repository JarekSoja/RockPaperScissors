package pl.jarek.rockpaperscissors;

class HumanPlayer implements Player {

    private final String NAME;
    private int points;

    HumanPlayer(String NAME, int points) {
        this.NAME = NAME;
        this.points = points;
    }

    HumanPlayer(String NAME) {
        this.NAME = NAME;
    }

    public String getName() {
        return this.NAME;
    }

    public int getPoints() {
        return this.points;
    }

    public void addPoint() {
        this.points++;
    }
}
