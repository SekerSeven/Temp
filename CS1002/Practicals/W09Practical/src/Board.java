public class Board {

    // The following five constants were defined in the starter code (kt54)
    public static final int BOARD_SIZE = 7;
    public static final char FREE = '.';
    public static final char INVALID = ' ';
    public static final char FOX = '*';
    public static final char GOOSE = 'o';

    private int boardsize;
    public char[][] board;

    // Default constructor was provided by the starter code. Extend as needed (kt54)
    public Board() {
        this.boardsize = BOARD_SIZE;

        board = new char[boardsize][boardsize];

        // Clear all playable fields
        for (int x = 0; x < boardsize; x++) {
            for (int y = 0; y < boardsize; y++) {
                board[x][y] = INVALID;
            }
        }
        for (int x = 2; x < 5; x++) {
            for (int y = 0; y < boardsize; y++) {
                board[x][y] = FREE;
            }
        }
        for (int x = 0; x < boardsize; x++) {
            for (int y = 2; y < 5; y++) {
                board[x][y] = FREE;
            }
        }
        for (int x = 2; x < 5; x++) {
            for (int y = 0; y < 3; y++) {
                board[x][y] = GOOSE;
            }
        }
        for (int x = 0; x < 2; x++) {
            for (int y = 2; y < 4; y++) {
                board[x][y] = GOOSE;
            }
        }
        for (int x = 5; x < boardsize; x++) {
            for (int y = 2; y < 4; y++) {
                board[x][y] = GOOSE;
            }
        }
        // Put a single fox in the middle
        board[boardsize / 2][boardsize - 2] = FOX;
    }

    // Prints the board. This method was provided with the starter code. Better not
    // modify to ensure
    // output consistent with the autochecker (kt54)
    public void printBoard() {

        for (int y = 0; y < boardsize; y++) {
            for (int x = 0; x < boardsize; x++) {
                System.out.print(" ");
                switch (board[x][y]) {
                    case FREE:
                        System.out.print(".");
                        break;
                    case FOX:
                        System.out.print("*");
                        break;
                    case GOOSE:
                        System.out.print("o");
                        break;
                    default:
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
