import java.io.IOException;
import java.util.Scanner;

/**
 * Написать игру крестики нолики.
 * Поочередно требуйте от игроков вводить координаты двумерного массива.
 * При выигрыше выведите вопрос, начать ли новую игру.
 */
public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] gameGrid = {
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}
        };
        char x = 'X';
        char o = 'O';

        System.out.println("TIC\t\t<1>\t<2>\t<3>\nTAC\t\t<4>\t<5>\t<6>\nTOE\t\t<7>\t<8>\t<9>\n");
        print(gameGrid);

        while (true) {
            System.out.printf("Enter position number (1-9) for %c symbol: ",x);
            play(gameGrid, sc.next(), x);
            print(gameGrid);
            if(isGameFinished(gameGrid, x)) break;

            System.out.printf("Enter position number (1-9) for %c symbol: ",o);
            play(gameGrid, sc.next(), o);
            print(gameGrid);
            if(isGameFinished(gameGrid, o)) break;
        }
    }

    public static void print(char[][] gameGrid) {
        for (char[] row : gameGrid) {
            for (char c : row) {
                System.out.print(c);
                }
            System.out.println();
        }
    }

    public static void play(char[][] gameGrid, String pos, char symbol) {
        Scanner sc = new Scanner(System.in);
        String error = "THIS POSITION IS TAKEN!\n\tPLEASE TRY AGAIN: ";

        switch (pos) {
            case "1" -> {
                if(gameGrid[0][0] == ' ') {
                    gameGrid[0][0] = symbol;
                } else {
                    System.out.print(error);
                    play(gameGrid, sc.next(), symbol);
                }
            }
            case "2" -> {
                if(gameGrid[0][2] == ' ') {
                    gameGrid[0][2] = symbol;
                } else {
                    System.out.print(error);
                    play(gameGrid, sc.next(), symbol);
                }
            }
            case "3" -> {
                if(gameGrid[0][4] == ' ') {
                    gameGrid[0][4] = symbol;
                } else {
                    System.out.print(error);
                    play(gameGrid, sc.next(), symbol);
                }
            }
            case "4" -> {
                if(gameGrid[2][0] == ' ') {
                    gameGrid[2][0] = symbol;
                } else {
                    System.out.print(error);
                    play(gameGrid, sc.next(), symbol);
                }
            }
            case "5" -> {
                if(gameGrid[2][2] == ' ') {
                    gameGrid[2][2] = symbol;
                } else {
                    System.out.print(error);
                    play(gameGrid, sc.next(), symbol);
                }
            }
            case "6" -> {
                if(gameGrid[2][4] == ' ') {
                    gameGrid[2][4] = symbol;
                } else {
                    System.out.print(error);
                    play(gameGrid, sc.next(), symbol);
                }
            }
            case "7" -> {
                if(gameGrid[4][0] == ' ') {
                    gameGrid[4][0] = symbol;
                } else {
                    System.out.print(error);
                    play(gameGrid, sc.next(), symbol);
                }
            }
            case "8" -> {
                if(gameGrid[4][2] == ' ') {
                    gameGrid[4][2] = symbol;
                } else {
                    System.out.print(error);
                    play(gameGrid, sc.next(), symbol);
                }
            }
            case "9" -> {
                if(gameGrid[4][4] == ' ') {
                    gameGrid[4][4] = symbol;
                } else {
                    System.out.print(error);
                    play(gameGrid, sc.next(), symbol);
                }
            }
            default -> {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.print("UNEXPECTED VALUE: " + pos +
                            "\n(!) You can use only one of the next numbers: " +
                            "1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9\n\tPLEASE TRY AGAIN: ");
                    play(gameGrid, sc.next(), symbol);
                }
            }
        }
    }

    public static void reset(char[][] gameGrid) {
        for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid.length; j++) {
                if(i % 2 == 0 && j % 2 == 0) {
                    gameGrid[i][j] = ' ';
                }
            }
        }
    }
    public static boolean isGameFinished(char[][] gameGrid, char symbol) {
        Scanner sc = new Scanner(System.in);

        if ((gameGrid[0][0] == symbol && gameGrid[0][2] == symbol && gameGrid[0][4] == symbol) ||
            (gameGrid[2][0] == symbol && gameGrid[2][2] == symbol && gameGrid[2][4] == symbol) ||
            (gameGrid[4][0] == symbol && gameGrid[4][2] == symbol && gameGrid[4][4] == symbol) ||

            (gameGrid[0][0] == symbol && gameGrid[2][0] == symbol && gameGrid[4][0] == symbol) ||
            (gameGrid[0][2] == symbol && gameGrid[2][2] == symbol && gameGrid[4][2] == symbol) ||
            (gameGrid[0][4] == symbol && gameGrid[2][4] == symbol && gameGrid[4][4] == symbol) ||

            (gameGrid[0][0] == symbol && gameGrid[2][2] == symbol && gameGrid[4][4] == symbol) ||
            (gameGrid[4][0] == symbol && gameGrid[2][2] == symbol && gameGrid[0][4] == symbol)) {
            System.out.println("CONGRATULATIONS!\n\tPlayer '" + symbol + "' wins!");

            System.out.println("RESTART?\n\tfor \"YES\" -> press Y\n\tfor \"NO\" -> press N");
            String restart = sc.next();
            switch (restart) {
                case "Y", "y" -> {
                    reset(gameGrid);
                    print(gameGrid);
                    return false;
                }
                case "N", "n" -> {
                    System.out.println("\tGAME OVER");
                    return true;
                }
                default -> {
                    try {
                        throw new IOException();
                    } catch (IOException e) {
                        System.out.print("UNEXPECTED VALUE: " + restart +
                                "\n\tPLEASE TRY AGAIN: ");
                        sc.next();
                        reset(gameGrid);
                        print(gameGrid);
                        return false;
                    }
                }
            }
        }

        for (int i = 0; i < gameGrid.length; i++) {
            for (int j = 0; j < gameGrid.length; j++) {
                if (gameGrid[i][j] == ' ') {
                    return false;
                }
            }
        }
        System.out.println("\tGAME OVER");
        return true;
    }
}
