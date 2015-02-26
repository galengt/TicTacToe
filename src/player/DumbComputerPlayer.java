package player;

public class DumbComputerPlayer implements Player {

    @Override public int[][] pickMove(int[][] movesMade) {
        while (true) {
            int i = (int) (Math.random() * 3 + 1);
            i = i - 1;
            int j = (int) (Math.random() * 3 + 1);
            j = j - 1;
            int current = movesMade[i][j];
            if (current == 9) {
                movesMade[i][j] = 0;
                break;
            }
        }
        return movesMade;
    }

}
