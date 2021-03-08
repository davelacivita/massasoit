import java.util.Scanner;

public class MagicSquare_DL {
    public static void main(String[] args) {
        int size = getNum();

        int[][] magicSquareArray = new int[size][size];
        int r = 0, c = 0, tempr = 0, tempc = 0, mid = size/2;

        populateArrayWithZeros(magicSquareArray, size);

        //place 1 top row center column
        r = 0; 
        c = mid;
        magicSquareArray[r][mid] = 1;        

        populateArray(magicSquareArray, size, r, c, tempr, tempc);
        printArray(magicSquareArray, size);

    }//end main

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

    public static void populateArrayWithZeros(int[][] arrayPassed, int size) {
    for(int r = 0; r < size; ++r) {
        for (int c = 0; c < size; ++c) {
            arrayPassed[r][c] = 0; 
            }//end inner
        }//end outer
    }//end method

    //"up" means -1 row and "over" means +1 column
    public static void populateArray(int[][] arrayPassed, int size, int r, int c, int tempr, int tempc) {
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
            
            if (arrayPassed[r][c] != 0) {
                 r = tempr + 1;
                 c = tempc;
                 if (r < 0) {
                     r = 0;
                 }
            }
            arrayPassed[r][c] = i;
            tempr = r;
            tempc = c;
        }//end for
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
}//end class
