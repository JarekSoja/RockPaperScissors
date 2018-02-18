package pl.jarek.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    private Scanner reader = new Scanner(System.in);
    private Random random = new Random();

    public void run(){
        System.out.println("Hello!\n We are going to play a game of rock scissors and paper. Are you ready?\nPress 'y' to confirm or any other kay to exit game.");
        if (GameLogic.yesOrNo(reader.next().charAt(0))){
            System.out.println("OK, I assume you know the basic rules.\n Please press:\n'1' for rock\n'2' for scissors\n'3' for paper");
            GameLogic.results(reader.nextInt(), this.generate());
        }
    }

    private static boolean yesOrNo(char c){
        return (c == 'y' );
    }

    private int generate(){
        return random.nextInt(2) + 1;
    }

    private static void results(int player, int aI){
        if (player == aI) System.out.println("It's a draw!");
        else if (player == 1){
            if (aI == 2) System.out.println("Scissors!\n Damn, I lost!");
            else System.out.println("Paper!\nOh yes! I won!");
        } else if (player == 2){
            if (aI == 3) System.out.println("Paper!\n Damn, I lost!");
            else System.out.println("Rock!\nOh yes! I won!");
        } else {
            if (aI == 1) System.out.println("Rock!\n Damn, I lost!");
            else System.out.println("Scissors!\nOh yes! I won!");
        }
    }
}
