import java.util.Scanner;

public class Board {
    private static final int BOARD_WIDTH = 10;
    private static final int BOARD_HEIGHT = 10;
    private static final boolean EMPTY = false;
    private static final boolean FILLED = true;
    boolean[][] mineGrid = new boolean[BOARD_HEIGHT][BOARD_WIDTH];

    public Board() {
        mineGrid = new boolean[BOARD_HEIGHT][BOARD_WIDTH];
        mineGrid[0][0] = FILLED;
        mineGrid[3][5] = FILLED;
    }

    public void printBoard() {
        for (int i = 0; i < BOARD_HEIGHT; i++) {
            for (int j = 0; j < BOARD_WIDTH; j++) {
                if (mineGrid[i][j] == FILLED) {
                    System.out.print("M");
                } else {
                    System.out.print(".");
                }
            }
            System.out.print("\n");
        }
    }

    public int countMineNeighbours(int x, int y) {
        int count;
        if (x == 0) {
            if (y == 0) {
                if (mineGrid[x + 1][y] == FILLED) {
                    count++;
                }
                if (mineGrid[x][y + 1] == FILLED) {
                    count++;
                }
                if (mineGrid[x + 1][y + 1]) {
                    count++;
                }
            } else if (y == BOARD_HEIGHT) {
                if (mineGrid[x + 1][y] == FILLED) {
                    count++;
                }
                if (mineGrid[x][y - 1] == FILLED) {
                    count++;
                }
                if (mineGrid[x + 1][y - 1] == FILLED) {
                    count++;
                }
            } else {
                if (mineGrid[x][y + 1] == FILLED) {
                    count++;
                }
                if(mineGrid[x + 1][y + 1] == FILLED) {
                    count++;
                }
                if(mineGrid[x + 1][y] == FILLED) {
                    count++;
                }
                if(mineGrid[x + 1][y - 1] == FILLED) {
                    count++;
                }
                if(mineGrid[x][y - 1] == FILLED) {
                    count++;
                }
            } 
        }
    }
}
