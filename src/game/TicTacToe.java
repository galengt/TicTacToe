package game;

import player.DumbComputerPlayer;
import player.HumanPlayer;
import player.Player;
import board.Board;
import board.TicTacToeBoard;

public class TicTacToe implements Game {

    Board board;
    Player computer;
    Player player;
    int[][] movesMade;// 9 means empty
    
    public static void main(String[] args) {
        Game game = new TicTacToe();
        game.play();
    }
    
    @Override public void play() {
        init();
        Board board = new TicTacToeBoard();
        board.drawBoard(movesMade);
        Player player = new HumanPlayer();
        Player computer = new DumbComputerPlayer();
        while(true) {
            movesMade = player.pickMove(movesMade);
            board.drawBoard(movesMade);
            if (haveWinner(movesMade)) {
                System.out.println("Player wins!!");
                break;
            }
            movesMade = computer.pickMove(movesMade);
            board.drawBoard(movesMade);
            if (haveWinner(movesMade)) {
                System.out.println("Computer wins :(");
                break;
            }
        }
    }

    @Override public boolean haveWinner(int[][] movesMade) {
        String[] possibleWins = {"0,1,2","3,4,5","6,7,8","0,3,6","1,4,7","2,5,8","0,4,8","2,4,6"};
        for (int i = 0; i < possibleWins.length; i++) {
            String indexes = possibleWins[i];
            String[] indexArray = indexes.split(",");
            int typeForStreak = -1;
            for (int j = 0; j < indexArray.length; j++) {
                int index = Integer.valueOf(indexArray[j]);
                int k = index/3;
                int l = index % 3;
                int current = movesMade[k][l];
                if (typeForStreak < 0) {
                    typeForStreak = movesMade[k][l];
                }
                //If this one isn't the same as the last one in this line it isn't a win,
                //otherwise if the streak isn't the empty space we have a winner
                if (current != typeForStreak) break;
                if (j == 2 && current != 9) {
                    System.out.println("Winning streak: " + indexes);
                    return true;
                }
            }
        }
        return false;
    }

    @Override public void init() {
        if (movesMade == null || movesMade.length < 3) {
            int[][] init = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    init[i][j] = 9;
                }
            }
            movesMade = init;
        }
    }
    
    

}
