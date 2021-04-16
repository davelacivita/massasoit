public class RecursionDemo {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(sumIterative(n));
        System.out.println(sumRecursive(n));
    }//end main

    public static int sumIterative(int nPassed) {
        int total = 0;
        for (int i = nPassed; i > 0; --i) {
            total = total + i;
        }
        return total;
    }//end method

    public static int sumRecursive(int nPassed) {
        if (nPassed == 1) {
            return 1;
        }
        else {
            return (sumRecursive(nPassed - 1)) + nPassed;
        }
    }//end method
}//end class
