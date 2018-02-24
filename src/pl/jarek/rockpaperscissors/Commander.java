package pl.jarek.rockpaperscissors;

import java.util.Scanner;

public class Commander {

    private Scanner reader = new Scanner(System.in);
    private int[][] results = new int[3][3];

    public int welcomeMenu(){
        System.out.println("Hello!\nWe are going to play rock scissors paper game. Please choose game mode:\n1. Classic game we all know and love");
        System.out.println("2. Extreme Halloween mode where we will be using tools straight from classic horror movies.");
        return reader.nextInt();
    }

    public void showInstructions(){
        System.out.println("So you want to taste the fear?\nWe will be playing extreme halloween version of everyone's favourite game with iconic horror monsters as our pawns.");
        System.out.println("First will be Jason Vorhees straight from Friday the 13th series with his iconic machete\nPress '1' to choose him.");
        System.out.println("Second is Freddie Krueger coming from Elm Street packing unforgettable glove that wrecks Jason!\n Press '2' to choose him.");
        System.out.println("Third is Michael Myers with huge kitchen knife that makes holes in this striped jumper of Freddie's\nPress '3' to choose him.");
        System.out.println("Fourth contestant - GhostFace from Scream with his/her creepy phone that makes Michael Myers faint.\nPress '4' to choose him/her");
        System.out.println("Last but not least is Xenomorph that easily beast cheap phone tricks of GhostFace.\nPress '5' to choose it");
        System.out.println("And finally - Jason beats puny xenomorph with his trusted machete!");
        System.out.println("Summarizing: \n 5 beats 4 that beats 3 that beats 2 that beats 1 that beats 5");
    }

    public void showCurrentStats(){
        System.out.println("");

    }

    public void setName(Player player){

    }

    public void setNumberOfRounds(){

    }

    public int getPlayerMove(){
        return 0;

    }
}
