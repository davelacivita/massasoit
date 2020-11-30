public class PrimeMethodsDemo_DL {
    public static void main(String[] args) {
        boolean result = true;
        boolean isPrime = true;

        int input = TypesOfPrimes_DL.getInput();
        if (TypesOfPrimes_DL.determineIfPrime(input) == false) {
            result = false;
            System.out.println("Prime: " + result);
        }
        else {
            System.out.println("Prime: " + result);
        }
        if (isPrime == true && result == true) {
            if (TypesOfPrimes_DL.isSophieGermainPrime(input) == false) {
                result = false;
                System.out.println("Sophie Germain: " + result);
            }
            else {
                System.out.println("Sophie Germain: " + result);
            }
            if (TypesOfPrimes_DL.isTwinPrime(input) == false) {
                result = false;
                System.out.println("Twin Prime: " + result);
            }
            else {
                System.out.println("Twin Prime: " + result);
            }
            if (TypesOfPrimes_DL.isMersennePrime(input) == false) {
                result = false;
                System.out.println("Mersenne Prime: " + result);
            }
            else {
                System.out.println("Mersenne Prime: " + result);
            }
        }// end if
        else {
            System.out.println("Sophie Germain: " + result);
            System.out.println("Twin Prime: " + result);
            System.out.println("Mersenne Prime: " + result);
        }
    }// end main
}// end class
