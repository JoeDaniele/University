public class NoughtsCrossesObject { //TicTacToe Game oof
    ///instance variables
    private final String[][] board;
    private int turns;

    //constructor
    public NoughtsCrossesObject() { //creates the 3x3 board w/ 0 turns
        board = new String[3][3];
        turns = 0;

        for (int r = 0; r < 3; r++)  //loops thru the board setting all values to an empty string.
            for (int c = 0; c < 3; c++)
                board[r][c] = " ";
    }

    public boolean isWinner(String p) { //returns true if player p has won -- using HELPER method
        //top row
        if (winCheck(p, 0, 0, 0, 1, 0, 2)) return true;
        if (winCheck(p, 1, 0, 1, 1, 1, 2)) return true;
        if (winCheck(p, 2, 0, 2, 1, 2, 2)) return true;
        if (winCheck(p, 0, 0, 1, 0, 2, 0)) return true;
        if (winCheck(p, 0, 0, 1, 1, 2, 1)) return true;
        if (winCheck(p, 0, 1, 1, 2, 2, 2)) return true;
        if (winCheck(p, 0, 0, 1, 1, 2, 2)) return true;
        return winCheck(p, 2, 0, 1, 1, 0, 2);
    }

    private boolean winCheck(String p, int a, int b, int c, int d, int e, int f) { //private HELPER method
        return board[a][b].equals(board[c][d])
                && board[a][b].equals(board[e][f]);
    }

    public boolean isFull() {
        return turns == 9;
        //returns 9
        // else return false is implied
    }

    public boolean isCat() {
        return isFull() && !isWinner("X") && !isWinner("O");
    }

    public boolean isValid(int r, int c) {
        if (0 <= r && r <= 2 && 0 <= c && c <= 2)
            return true;
        else
            return false;
    }

    public int numTurns() {
        return turns;
    }

    public String playerAt(int r, int c) {
        if (isValid(r, c))
            return board[r][c];
        else
            return "@";
    }

    public boolean isTaken(int r, int c) {
        String p = playerAt(r, c);
        if (p.equals(" "))
            return false;
        else
            return true;
    }

    public String toString() {
        String out = "";
        out += " 0 " + board[0][0] + "|" + board[0][1] + "|" + board[0][2] + "\n";
        out += "   --+-+--" + "\n";
        out += " 1 " + board[1][0] + "|" + board[1][1] + "|" + board[1][2] + "\n";
        out += "   --+-+--" + "\n";
        out += " 2 " + board[2][0] + "|" + board[2][1] + "|" + board[2][2] + "\n";
        out += "   0 1 2 " + "\n";
        return out;
    }

    public void playMove(String p, int r, int c) {
        board[r][c] = p;
        turns++;
    }
}