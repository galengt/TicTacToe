package player;

import java.util.Scanner;

public class HumanPlayer implements Player {
    
    @Override public int[][] pickMove(int[][] movesMade) {
        Scanner input = new Scanner (System.in );
        int move;

        System.out.println("Please select a square to play by selecting a number 1-9. 1 is top left, 9 bottom right.");
        while (!input.hasNextInt()) {
            System.out.println("Your input does not match the criteria, please enter a number between 1 and 9");
            input.next();
        }
        move = input.nextInt();
        while (move > 9 || move < 1) {
            System.out.println("Your input does not match the criteria, please enter a number between 1 and 9");
            move = input.nextInt();
        }
        //check it that spot is taken
        move = move -1;
        int i = move/3;
        int j = move % 3;
        int current = movesMade[i][j];
        if (current == 9) {
            movesMade[i][j] = 1;
        } else if (current == 0 || current == 1) {
            System.out.println("That square is already taken, try another");
            move = input.nextInt();
        }
        return movesMade;
    }

}
