public class Grains {
    public static void main(String[] args) {
        long piecesGrain = 1;
        int squares = 64;
        System.out.println();
        System.out.println(numGrainsRecursive(squares, piecesGrain));
    }//end main

    public static long numGrainsRecursive(int squaresPassed, long piecesGrainPassed) {
        if (squaresPassed == 1) {
            return piecesGrainPassed;
        }
        else {
            return piecesGrainPassed + numGrainsRecursive(squaresPassed - 1, 2 * piecesGrainPassed);
        }
    }
    
}//end class
