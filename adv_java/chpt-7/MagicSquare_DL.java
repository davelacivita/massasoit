import java.util.Scanner;

public class MagicSquare_DL {
    public static void main(String[] args) {
        int size = getNum();
        int[][] magicSquareArray = new int[size][size];
        
        int r = 0, c = 0, tempr = 0, tempc = 0, mid = size/2;

        populateArrayWithZeros(magicSquareArray, size);

        //reset variables
        c = mid;
        r = 0; 

        //place 1 top row center column
        magicSquareArray[r][mid] = 1;

        for (int i = 2; i <= size*size; ++i) {
            if (r - 1 < 0) {
                r = size - 1;
            }
            else {
                r = r - 1;
            }

            if (c + 1 >= size) {
                c = 0;
            }
            else {
                c = c + 1;
            }
            
            if (magicSquareArray[r][c] != 0) {
                 r = tempr + 1;
                 c = tempc;
                 if (r < 0) {
                     r = 0;
                 }
            }
            magicSquareArray[r][c] = i;
            tempr = r;
            tempc = c;
        }//end for

        printArray(magicSquareArray, size);

    }//end main

    public static void populateArrayWithZeros(int[][] arrayPassed, int size) {
    for(int r = 0; r < size; ++r) {
        for (int c = 0; c < size; ++c) {
            arrayPassed[r][c] = 0; 
            }//end inner
        }//end outer
    }//end method

    public static void printArray(int[][] arrayPassed, int size) {
        
            int c = 0;
            System.out.println();
            for (int r = 0;r <= size -1; ++r) {
                for (c = 0; c <= size - 1; ++c) {
                    System.out.print(arrayPassed[r][c] + "\t");
                }
                System.out.println();
            }
        }//end method

    public static int getNum() {
        int user;
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Please enter an odd number: ");
            user = keyboard.nextInt();
        }
        while (user % 2 == 0); {
        }
        keyboard.close();
        return user;
    }//end method
    
        
}//end class
