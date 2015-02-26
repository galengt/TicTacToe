package game;


public interface Game {

    public void init();
    
    public void play();
    
    public boolean haveWinner(int[][] movesMade);
}
