import java.util.Scanner;

public class MovingDay_DL {
    public static void main(String[] args) {
        int numTrue, numFalse;

        numTrue = getTrue();
        numFalse = getFalse();

        int size = numFalse + numTrue + 1;
        int[] movingDayArray = populateArray(numTrue, numFalse, size);
        boolean gameOver = false;
        int empty = numTrue;

        while (gameOver == false) {
            printArray(movingDayArray, size);
            int move = getMove(size);
            empty = playGame(movingDayArray, size, move, empty);
            gameOver = gameOutCome(movingDayArray, numTrue, numFalse, size, empty, gameOver);

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
        for (int i = 0; i < game.length; ++i) {
            System.out.print(game[i]);
        }
        return game;
    }

    public static void printArray(int[] movingDayArray, int size) {
        System.out.println();
        for (int i = 0; i < size; ++i) {
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

    public static int getMove(int size) {
        int move;
        do {
            System.out.println("Choose number to move");
            Scanner keyboard = new Scanner(System.in);
            move = keyboard.nextInt();
        } // end do
        while (move < 0 || move > size);
        return move;
    }

    public static boolean gameOutCome(int[] game, int numTrue, int numFalse, int size, int empty, boolean gameOver) {
        String WIN = "Congatulations, you win!";
        String LOSE = "Sorry, no more moves, you lose.";
        boolean win = true;
        
        for (int i = 0; i < size; i++) {
            if (i < numTrue && game[i] != 0) {
                win = false;
                break;
                
            } 
            if (i == numTrue && game[i] != 2) {
                win = false;
                break;

                
            } 
            if (i > numTrue && game[i] != 1) {
                win = false;
                break;

            }
           
            
        } // end for
        if (win == true) {
            gameOver = true;
            printArray(game, size);
            System.out.println(WIN);
        }
        else if (!((empty - 1) >= 0 && (game[empty - 1] == 1)) && ((empty + 1) < size) && !(game[empty + 1] == 0)) {
            if (!((empty - 2) >= 0 &&  game[empty - 2] == 1 && game[empty - 1] == 0) && !((empty + 2) < size && game[empty + 2] == 0)) {
                gameOver = true;
                printArray(game, size);
                System.out.println(LOSE);

            }
        }        
        return gameOver;
    }

    // while game is not over? Switch?
    public static int playGame(int[] game, int size, int move, int empty) {
        String RIGHT = ("Sliding T at " + move + " to the right.");
        String LEFT = ("Sliding F at " + move + " to the left.");
        String JUMP_RIGHT = ("Jumping T at " + move + " to the right.");
        String JUMP_LEFT = ("Jumping F at " + move + " to the left.");
        String NO_JUMP = ("True can not jump a True");
        String T_CANNOT_MOVE = ("T at " + move + " can't move!");
        String F_CANNOT_MOVE = ("F at " + move + " can't move!");
        // T moves right
        if (game[move] == 2) {
            System.out.println("There's nothing there to move");
        } else if (game[move] == 1) {
            if (game[move + 1] == 2) {
                game[move] = 2;
                game[move + 1] = 1;
                empty = move;
                System.out.println(RIGHT);
            } else if (game[move + 1] == 0 && game[move + 2] == 2) {
                game[move] = 2;
                game[move + 2] = 1;
                empty = move;
                System.out.println(JUMP_RIGHT);
            } else if (game[move + 1] == 1) {
                System.out.println(T_CANNOT_MOVE);
            } else if (game[move + 1] == 1 && game[move + 2] == 2) {
                System.out.println(NO_JUMP);
            }
        } // end if

        // F moves left
        else if (game[move] == 0) {
            
            if (game[move - 1] == 2) {
                game[move] = 2;
                game[move - 1] = 0;
                empty = move;
                System.out.println(LEFT);
            } 
            else if (game[move - 2] == 2) {
                game[move] = 2;
                game[move - 2] = 0;
                empty = move;
                System.out.println(JUMP_LEFT);
            } 
            
            else if (game[move - 2] != 2) {
                System.out.println(F_CANNOT_MOVE);
            }
        } // end if
        return empty;
    }// end method

}// end class
