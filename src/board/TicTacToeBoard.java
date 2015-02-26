package board;



public class TicTacToeBoard implements Board {

    private static final String EMPTY_SPACE = "___";
    private static final String HUMAN_SPACE = "_X_";
    private static final String COMP_SPACE = "_O_";
    
    
    @Override public void drawBoard(int[][] movesMade) {
        //FIXME row by row is not that smart, fix later
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < movesMade[0].length; i++) {
            if (movesMade[0][i] == 9) {
                buf.append(EMPTY_SPACE + "|");
            } else if (movesMade[0][i] == 1) {
                buf.append(HUMAN_SPACE + "|");
            } else if (movesMade[0][i] == 0) {
                buf.append(COMP_SPACE + "|");
            }
        }
        if (buf.charAt(11) == '|') {
            buf.deleteCharAt(11);
        }
        System.out.println(buf.toString());
        buf = new StringBuffer();
        for (int i = 0; i < movesMade[1].length; i++) {
            if (movesMade[1][i] == 9) {
                buf.append(EMPTY_SPACE + "|");
            } else if (movesMade[1][i] == 1) {
                buf.append(HUMAN_SPACE + "|");
            } else if (movesMade[1][i] == 0) {
                buf.append(COMP_SPACE + "|");
            }
        }
        if (buf.charAt(11) == '|') {
            buf.deleteCharAt(11);
        }
        System.out.println(buf.toString());
        buf = new StringBuffer();
        for (int i = 0; i < movesMade[1].length; i++) {
            if (movesMade[2][i] == 9) {
                buf.append(EMPTY_SPACE + "|");
            } else if (movesMade[2][i] == 1) {
                buf.append(HUMAN_SPACE + "|");
            } else if (movesMade[2][i] == 0) {
                buf.append(COMP_SPACE + "|");
            }
        }
        if (buf.charAt(11) == '|') {
            buf.deleteCharAt(11);
        }
        String lastLine = buf.toString().replace('_', ' ');
        System.out.println(lastLine);
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }


}
