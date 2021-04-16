public class Handshakes {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(handshakesIterative(n));
        System.out.println(handshakeRecursive(n));
    }// end main

    public static int handshakesIterative(int nPassed) {
        int total = 0;
        for (int i = nPassed - 1; i > 0; --i) {
            total = total + i;
        }
        return total;
    }

    public static int handshakeRecursive(int nPassed) {
        if (nPassed == 1) {
            return 0;
        }
        else {
            return (nPassed - 1) + handshakeRecursive(nPassed - 1);
        }
    }
}// end class
