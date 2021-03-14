import java.util.Scanner;

public class MovingDay_DL {
    public static void main(String[] args) {
        int numTrue, numFalse;

        numTrue = getTrue();
        numFalse = getFalse();

        int size = numFalse + numTrue + 1;
        int empty = numTrue;
        int[] movingDayArray = populateArray(numTrue, numFalse, size);
        boolean gameOver = false;

        while (gameOver == false) {
            printArray(movingDayArray, size, empty);
            System.out.println("Choose number to move");
            Scanner keyboard = new Scanner(System.in);
            int move = keyboard.nextInt();
            playGame(movingDayArray, size, empty, move);
            boolean win = playerWins(movingDayArray, numTrue, numFalse);
            boolean lose = playerLoses(movingDayArray, numTrue, numFalse, move, empty);
            if (win == true) {
                System.out.println("Congratulations, you win!");
                gameOver = true;
            }
            if (lose == true) {
                gameOver = true;
                System.out.println("Sorry, no more moves, you lose!");
            }

        }

    }// end main

    public static int getTrue() {
        int trues;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Using an whole nmber, please enter the number of Trues:");
        return trues = keyboard.nextInt();

    }// end method

    public static int getFalse() {
        int falses;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Using an whole nmber, please enter the number of Falses:");
        return falses = keyboard.nextInt();
    }// end method

    public static int[] populateArray(int numTrue, int numFalse, int size) {
        int game[] = new int[size];

        for (int i = 0; i < numTrue; ++i) {
            game[i] = 1;
        }
        game[numTrue] = 2;
        for (int i = numTrue + 1; i < size; ++i) {
            game[i] = 0;
        }
        return game;
    }

    public static void printArray(int[] movingDayArray, int size, int empty) {
        System.out.println();
        for (int i = 1; i < size + 1; ++i) {
            System.out.print(" " + i);
        } // end for
        System.out.println();
        System.out.print("|");

        for (int i = 0; i < size; ++i) {
            if (movingDayArray[i] == 1) {
                System.out.print("T|");
            } else if (movingDayArray[i] == 0) {
                System.out.print("F|");
            } else if (movingDayArray[i] == 2) {
                System.out.print(" |");
            }
        } // end for
        System.out.println();
    }// end method

    public static boolean playerWins(int[] game, int numTrue, int numFalse) {
        boolean win = false, allTrues = false, allFalses = false;

        for (int i = 0; i < numTrue; ++i) {
            if (game[i] == 0) {
                allFalses = true;
            }
        } // end for

        for (int j = numTrue + 1; j < game.length; ++j) {
            if (game[j] == 1) {
                allTrues = true;
            }
        } // end for

        if (allFalses == true && allTrues == true) {
            win = true;
        }
        return win;
    }

    public static boolean playerLoses(int[] game, int numTrue, int numFalse, int move, int empty) {
        boolean loses = true;
        if (game[move + 1] != empty && game[move + 2] != empty) {
            loses = false;
        }
        return loses;
    }

    // while game is not over? Switch?
    public static void playGame(int[] game, int size, int empty, int move) {
        String RIGHT = ("Sliding T at " + move + " to the right.");
        String LEFT = ("Sliding F at " + move + " to the left.");
        String JUMP_RIGHT = ("Jumping T at " + move + " to the right.");
        String JUMP_LEFT = ("Jumping F at " + move + " to the left.");
        String NO_JUMP = ("True can not jump a True");
        String T_CANNOT_MOVE = ("T at " + " can't move!");
        String F_CANNOT_MOVE = ("F at " + " can't move!");
        move = move - 1;
        // T moves right
        if (game[move] == 1) {
            if (game[move + 1] == empty) {
                game[move] = empty;
                game[move + 1] = 1;
                System.out.println(RIGHT);
            } else if (game[move + 1] == 0 && game[move + 2] == empty) {
                game[move] = empty;
                game[move + 2] = 1;
                System.out.println(JUMP_RIGHT);
            } else if (game[move + 1] == 1) {
                System.out.println(T_CANNOT_MOVE);
            }
            else if (game[move = 1] == 1 && game[move + 2] == empty) {
                System.out.println(NO_JUMP);
            }

        } // end if

        // F moves left
        if (game[move] == 0) {
            if (game[move - 1] == empty) {
                game[move] = empty;
                game[move - 1] = 0;
                System.out.println(LEFT);
            } else if (game[move - 1] == 0 && game[move - 2] == empty) {
                game[move] = empty;
                game[move - 2] = 0;
                System.out.println(JUMP_LEFT);
            }

            else if (game[move - 1] == 1 && game[move - 2] == empty) {
                game[move] = empty;
                game[move - 2] = 0;
                System.out.println(JUMP_LEFT);
            } else if (game[move - 1] != empty && game[move - 2] != empty) {
                System.out.println(F_CANNOT_MOVE);
            }
        } // end if

    }// end method

}// end class
