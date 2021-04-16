public class Recursive_Factorial {
    public static void main(String[] args) {
        long n = 3;
        System.out.println(factorialRecursive(n));
    }//end main

    public static long factorialRecursive(long nPassed) {
        if (nPassed == 0) {
            return 1;
        }
        else {
            return nPassed * factorialRecursive(nPassed - 1);
        }
    }//end method
}//end class
