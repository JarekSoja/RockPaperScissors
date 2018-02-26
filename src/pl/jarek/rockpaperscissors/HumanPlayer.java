package pl.jarek.rockpaperscissors;

public class HumanPlayer implements Player {

    private String name;
    private int points;

    HumanPlayer() {
        this.name = "";
        this.points = 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name=name;
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
