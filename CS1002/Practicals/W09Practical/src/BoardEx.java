public class BoardEx {
    public static final int BOARD_SIZE = 7;
    public static final char FREE = '.';
    public static final char INVALID = ' ';
    public static final char FOX = '*';
    public static final char GOOSE = 'o';
    private static final int FOX_NUM = 3;

    private int boardsize;
    public char[][] board;

    public BoardEx() {
        this.boardsize = BOARD_SIZE;

        board = new char[boardsize][boardsize];
        int min;
        int max;

        for (int x = 0; x < boardsize; x++) {
            for (int y = 0; y < boardsize; y++) {
                board[x][y] = INVALID;
            }
        }
        if (boardsize % 3 == 0) {
            min = boardsize / 3;
            max = 2 * (boardsize / 3) - 1;
        } else if (boardsize % 3 == 1) {
            min = boardsize / 3;
            max = 2 * (boardsize / 3);
        } else {
            min = boardsize / 3;
            max = 2 * (boardsize / 3) + 1;
        }
        for (int x = min; x <= max; x++) {
            for (int y = 0; y < boardsize; y++) {
                board[x][y] = FREE;
            }
        }
        for (int x = 0; x < boardsize; x++) {
            for (int y = min; y <= max; y++) {
                board[x][y] = FREE;
            }
        }

        if (boardsize % 2 == 0) {
            for (int x = 0; x < boardsize; x++) {
                for (int y = 0; y < boardsize / 2; y++) {
                    if (board[x][y] == FREE) {
                        board[x][y] = GOOSE;
                    }
                }
            }
        } else {
            for (int x = 0; x < boardsize; x++) {
                for (int y = 0; y < (boardsize - 1) / 2; y++) {
                    if (board[x][y] == FREE) {
                        board[x][y] = GOOSE;
                    }
                }
            }
            for (int y = boardsize / 2; y < boardsize / 2 + 1; y++) {
                for (int x = 0; x <= boardsize / 4; x++) {
                    board[x][y] = GOOSE;
                }
                for (int x = boardsize - 1; x > 3 * (boardsize / 4) + 1; x--) {
                    board[x][y] = GOOSE;
                }
            }
        }

        // Please don't put in too many foxes.
        for (int i = 0; i < FOX_NUM; i++) {
            board[BOARD_SIZE / 2][BOARD_SIZE / 2 + i + 1] = FOX;
        }
    }

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
