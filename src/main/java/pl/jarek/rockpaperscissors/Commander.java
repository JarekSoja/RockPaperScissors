package pl.jarek.rockpaperscissors;

import java.util.Scanner;

public class Commander {

    private static Scanner reader = new Scanner(System.in);

    public static String createNewPlayer(){
        System.out.println("Please give me your name.");
        return reader.next();
    }

    public static int welcomeMenu(){
        System.out.println("Hi! We are going to play rock scissors paper game. Please choose game mode:\n1. Classic game we all know and love");
        System.out.println("2. Extreme Halloween mode where we will be using tools straight from classic horror movies.");
        do {
            int gameMode = (reader.nextInt());
            if (gameMode == 1 || gameMode == 2) {
                return gameMode;
            } else {
                System.out.println("Incorrect value.");
            }
        } while (true);
    }

    public static void showInstructions(){
        System.out.println("So you want to taste the fear?\nWe will be playing extreme halloween version of everyone's favourite game with iconic horror monsters as our pawns.");
        System.out.println("First will be Jason Vorhees straight from Friday the 13th series with his iconic machete\nPress '1' to choose him.");
        System.out.println("Second is Freddie Krueger coming from Elm Street packing unforgettable glove that wrecks Jason!\nPress '2' to choose him.");
        System.out.println("Third is Michael Myers with huge kitchen knife that makes holes in this striped jumper of Freddie's\nPress '3' to choose him.");
        System.out.println("Fourth contestant - GhostFace from Scream with his/her creepy phone that makes Michael Myers faint.\nPress '4' to choose him/her");
        System.out.println("Last but not least is Xenomorph that easily beast cheap phone tricks of GhostFace.\nPress '5' to choose it");
        System.out.println("And finally - Jason beats puny xenomorph with his trusted machete!");
        System.out.println("Summarizing: \n 5 beats 4 that beats 3 that beats 2 that beats 1 that beats 5");
    }

    public static void showCurrentStats(int playerPoints, int computerPoints, int roundNumber, String playerName){
        System.out.println(playerName + " has " + playerPoints + " point/s\nComputer has " + computerPoints + " point/s.");
        System.out.println(roundNumber + " rounds left to play.");
    }

    public static int getNumberOfRounds(){
        System.out.println("Please enter number of rounds you wish to play: ");
        boolean correctValue = false;
        int value = 0;
        do {
            String input = reader.next();
            try {
                value = Integer.parseInt(input);
                correctValue = value >= 1;
                correctValue = true;
            } catch (Exception e) {
                System.out.println("Incorrect value.");
            }
        } while (!correctValue);
        return value;
    }

    public static int getPlayerMove(){
        System.out.println("Please choose your move: \nPress '0' for rock\nPress '1' for paper\nPress '2' for scissors");
        boolean correctValue = false;
        int value = 0;
        do {
            String input = reader.next();
            try {
                value = Integer.parseInt(input);
                if (value < 0 || value > 2) {
                    correctValue = false;
                    System.out.println("Incorrect value.");
                } else {
                    correctValue = true;
                }
            } catch (Exception e) {
                System.out.println("Incorrect value.");
            }
        } while (!correctValue);
        return value;
    }

    public static int getPlayerMoveInFive(){
        System.out.println("Please choose your move: \nPress '1' for Jason Vorhees\nPress '2' for Freddie Krueger\nPress '3' for Michael Myers\nPress '4' for GhostFace\nPress '5' for Xenomorph");
        boolean correctValue = false;
        int value = 0;
        do {
            String input = reader.next();
            try {
                value = Integer.parseInt(input);
                if (value < 1 || value > 5) {
                    correctValue = false;
                    System.out.println("Incorrect value.");
                } else {
                    correctValue = true;
                }
            } catch (Exception e) {
                System.out.println("Incorrect value.");
            }
        } while (!correctValue);
        return value;
    }

    public static void announceRoundResult(int result){
        if (result < 0){
            System.out.println("I won!");
        } else if (result > 0) {
            System.out.println("You won!");
        } else System.out.println("It's a draw!");
    }

    public static void announceFinalResults(int playerPoints, int computerPoints, String playerName){
        System.out.println("Game finished");
        System.out.println("Player " + playerName + " got " + playerPoints + " points.");
        System.out.println("Player " + ComputerPlayer.getName() + " got " + computerPoints + " points.");
        if (playerPoints < computerPoints) System.out.println("Computer won! Better luck next time.");
        else if (playerPoints > computerPoints) System.out.println("You won! Good job.");
        else System.out.println("Draw. We should play again to settle the score, hombre.");
    }
}
