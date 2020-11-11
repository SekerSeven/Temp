import java.util.Scanner;

public class Game {
    // The following five constants were defined in the starter code (kt54)
    private static final String FOXPLAYS_MSG = "Fox plays. Enter move:";
    private static final String GEESEPLAY_MSG = "Geese play. Enter move:";
    private static final String ILLEGALMOVE_MSG = "Illegal move!";
    private static final String FOXWINS_MSG = "Fox wins!";
    private static final String GEESEWIN_MSG = "Geese win!";

    private Board gameBoard;

    // Minimal constructor. Expand as needed (kt54)
    public Game() {
        gameBoard = new Board();
    }

    // Build on this method to implement game logic.
    public void play() {

        Scanner reader = new Scanner(System.in);

        gameBoard = new Board();

        boolean done = false;

        boolean gooseTurn = true;

        int boardSize = gameBoard.BOARD_SIZE;
        int minPos = 0;
        int range = 2;
        char goose = gameBoard.GOOSE;
        char fox = gameBoard.FOX;
        char free = gameBoard.FREE;

        while (!done) {
            gameBoard.printBoard();
            int count = 0;
            for (char[] a : gameBoard.board) {
                for (char b : a) {
                    if (b == goose) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println(FOXWINS_MSG);
                done = true;
            }
            while (gooseTurn) {
                System.out.println(GEESEPLAY_MSG);
                // Read the line as a string
                String command = reader.nextLine().trim();
                // convert the command into an integer that can be used as an index
                int row = Integer.parseInt(command);
                command = reader.nextLine().trim();
                int column = Integer.parseInt(command);
                command = reader.nextLine().trim();
                int newRow = Integer.parseInt(command);
                command = reader.nextLine().trim();
                int newColumn = Integer.parseInt(command);
                if (row >= 0 && row < boardSize && column >= 0 && column < boardSize && newRow >= 0
                        && newRow < boardSize && newColumn >= 0 && newColumn < boardSize
                        && gameBoard.board[row][column] == goose && gameBoard.board[newRow][newColumn] == free
                        && newRow < row + 2 && newRow > row - 2 && newColumn < column + 2 && newColumn > column - 2
                        && !(newRow == row && newColumn == column)) {
                    gameBoard.board[row][column] = free;
                    gameBoard.board[newRow][newColumn] = goose;
                    gooseTurn = !gooseTurn;
                } else {
                    System.out.println(ILLEGALMOVE_MSG);
                }
            }
            gameBoard.printBoard();
            int foxX = 0;
            int foxY = 0;
            for (int i = 0; i < boardSize; i++) {
                for (int j = 0; j < boardSize; j++) {
                    if (gameBoard.board[i][j] == fox) {
                        foxX = i;
                        foxY = j;
                    }
                }
            }
            for (int i = foxX - 2; i <= foxX + 2; i++) {
                for (int j = foxY - 2; j <= foxY + 2; j++) {
                    if (gameBoard.board[i][j] == free && ((i == 0 || j == 0) || Math.abs(i) == Math.abs(j))) {
                        break;
                    } else {
                        System.out.println(GEESEWIN_MSG);
                        done = true;
                    }
                }
            }
            while (!gooseTurn) {
                System.out.println(FOXPLAYS_MSG);
                String command = reader.nextLine().trim();
                int row = Integer.parseInt(command);
                command = reader.nextLine().trim();
                int column = Integer.parseInt(command);
                command = reader.nextLine().trim();
                int newRow = Integer.parseInt(command);
                command = reader.nextLine().trim();
                int newColumn = Integer.parseInt(command);
                // Checks that the piece is being moved and that the move is on the board
                if (row >= 0 && row < boardSize && column >= 0 && column < boardSize && newRow >= 0
                        && newRow < boardSize && newColumn >= 0 && newColumn < boardSize
                        && gameBoard.board[row][column] == fox && gameBoard.board[newRow][newColumn] == free
                        && !(newRow == row && newColumn == column)) {
                    // Checks that the move is legal depending on what move is being made (either a
                    // normal move or a take).
                    if (newRow < row + 2 && newRow > row - 2 && newColumn < column + 2 && newColumn > column - 2) {
                        gameBoard.board[row][column] = free;
                        gameBoard.board[newRow][newColumn] = fox;
                        gooseTurn = !gooseTurn;
                    } else if (newRow == row + 2
                            && (gameBoard.board[row + 1][column] == goose && newColumn == column
                                    || gameBoard.board[row + 1][column - 1] == goose && newColumn == column - 2
                                    || gameBoard.board[row + 1][column + 1] == goose && newColumn == column + 2)
                            || newRow == row - 2 && (gameBoard.board[row - 1][column] == goose && newColumn == column
                                    || gameBoard.board[row - 1][column - 1] == goose && newColumn == column - 2
                                    || gameBoard.board[row - 1][column + 1] == goose && newColumn == column + 2)
                            || newColumn == column + 2 && (gameBoard.board[row][column + 1] == goose && newRow == row)
                            || newColumn == column - 2
                                    && (gameBoard.board[row][column - 1] == goose && newRow == row)) {
                        gameBoard.board[row][column] = free;
                        gameBoard.board[newRow][newColumn] = fox;
                        gameBoard.board[(row + newRow) / 2][(column + newColumn) / 2] = free;
                        gooseTurn = !gooseTurn;
                    } else {
                        System.out.println(ILLEGALMOVE_MSG);
                    }

                } else {
                    System.out.println(ILLEGALMOVE_MSG);
                }
            }
        }
    }
}
