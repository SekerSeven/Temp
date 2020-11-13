import java.util.Scanner;

public class GameEx {
    private static final String FOXPLAYS_MSG = "Fox plays. Enter move:";
    private static final String GEESEPLAY_MSG = "Geese play. Enter move:";
    private static final String ILLEGALMOVE_MSG = "Illegal move!";
    private static final String FOXWINS_MSG = "Fox wins!";
    private static final String GEESEWIN_MSG = "Geese win!";

    private BoardEx gameBoard;
    Scanner reader;

    public GameEx() {
        gameBoard = new BoardEx();
        reader = new Scanner(System.in);
    }

    public void play() {

        boolean done = false;

        boolean gooseTurn = true;

        int boardSize = gameBoard.BOARD_SIZE;
        char goose = gameBoard.GOOSE;
        char fox = gameBoard.FOX;
        char free = gameBoard.FREE;

        while (!done) {
            int count = 0;
            for (char[] a : gameBoard.board) {
                for (char b : a) {
                    if (b == goose) {
                        count++;
                    }
                }
            }
            if (count == 0) {
                gameBoard.printBoard();
                System.out.println(FOXWINS_MSG);
                done = true;
            } else {
                while (gooseTurn) {
                    gameBoard.printBoard();
                    System.out.println(GEESEPLAY_MSG);
                    String command = reader.nextLine().trim();
                    if (command.equals("quit")) {
                        done = true;
                        break;
                    }
                    int row = Integer.parseInt(command);
                    command = reader.nextLine().trim();
                    if (command.equals("quit")) {
                        done = true;
                        break;
                    }
                    int column = Integer.parseInt(command);
                    command = reader.nextLine().trim();
                    if (command.equals("quit")) {
                        done = true;
                        break;
                    }
                    int newRow = Integer.parseInt(command);
                    command = reader.nextLine().trim();
                    if (command.equals("quit")) {
                        done = true;
                        break;
                    }
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
                count = 0;
                for (int i = foxX - 2; i <= foxX + 2 && foxX < boardSize; i++) {
                    if (i < 0 || i >= boardSize) {
                        continue;
                    }
                    for (int j = foxY - 2; j <= foxY + 2; j++) {
                        if (j < 0 || j >= boardSize) {
                            continue;
                        }
                        if (gameBoard.board[i][j] == free
                                && ((i == 0 || j == 0) || Math.abs(i - foxX) == Math.abs(j - foxY))) {
                            count++;
                        }
                    }
                }
                if (count == 0) {
                    gameBoard.printBoard();
                    System.out.println(GEESEWIN_MSG);
                    done = true;
                    gooseTurn = !gooseTurn;
                }
                while (!gooseTurn) {
                    gameBoard.printBoard();
                    System.out.println(FOXPLAYS_MSG);
                    String command = reader.nextLine().trim();
                    if (command.equals("quit")) {
                        done = true;
                        break;
                    }
                    int row = Integer.parseInt(command);
                    command = reader.nextLine().trim();
                    if (command.equals("quit")) {
                        done = true;
                        break;
                    }
                    int column = Integer.parseInt(command);
                    command = reader.nextLine().trim();
                    if (command.equals("quit")) {
                        done = true;
                        break;
                    }
                    int newRow = Integer.parseInt(command);
                    command = reader.nextLine().trim();
                    if (command.equals("quit")) {
                        done = true;
                        break;
                    }
                    int newColumn = Integer.parseInt(command);
                    if (row >= 0 && row < boardSize && column >= 0 && column < boardSize && newRow >= 0
                            && newRow < boardSize && newColumn >= 0 && newColumn < boardSize
                            && gameBoard.board[row][column] == fox && gameBoard.board[newRow][newColumn] == free
                            && !(newRow == row && newColumn == column)) {
                        if (newRow < row + 2 && newRow > row - 2 && newColumn < column + 2 && newColumn > column - 2) {
                            gameBoard.board[row][column] = free;
                            gameBoard.board[newRow][newColumn] = fox;
                            gooseTurn = !gooseTurn;
                        } else if (newRow == row + 2
                                && (gameBoard.board[row + 1][column] == goose && newColumn == column
                                        || gameBoard.board[row + 1][column - 1] == goose && newColumn == column - 2
                                        || gameBoard.board[row + 1][column + 1] == goose && newColumn == column + 2)
                                || newRow == row - 2
                                        && (gameBoard.board[row - 1][column] == goose && newColumn == column
                                                || gameBoard.board[row - 1][column - 1] == goose
                                                        && newColumn == column - 2
                                                || gameBoard.board[row - 1][column + 1] == goose
                                                        && newColumn == column + 2)
                                || newColumn == column + 2
                                        && (gameBoard.board[row][column + 1] == goose && newRow == row)
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
}
