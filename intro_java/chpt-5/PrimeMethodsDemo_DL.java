public class PrimeMethodsDemo_DL {
    public static void main(String[] args) {
        boolean result = true;
        boolean isPrime = true;
        String METHOD_PRIME = "Prime: ";
        String METHOD_SH = "Sophie Germain: ";
        String METHOD_TWIN = "Twin Prime: ";
        String METHOD_MP = "Mersenne Prime: ";

        int input = TypesOfPrimes_DL.getInput();
        if (TypesOfPrimes_DL.determineIfPrime(input) == false) {
            result = false;
            System.out.println(METHOD_PRIME + result);
        }
        else {
            System.out.println(METHOD_PRIME + result);
        }
        if (isPrime == true && result == true) {
            if (TypesOfPrimes_DL.isSophieGermainPrime(input) == false) {
                result = false;
                System.out.println(METHOD_SH + result);
            }
            else {
                System.out.println(METHOD_SH + result);
            }
            if (TypesOfPrimes_DL.isTwinPrime(input) == false) {
                result = false;
                System.out.println(METHOD_TWIN + result);
            }
            else {
                System.out.println(METHOD_TWIN + result);
            }
            if (TypesOfPrimes_DL.isMersennePrime(input) == false) {
                result = false;
                System.out.println(METHOD_MP + result);
            }
            else {
                System.out.println(METHOD_MP + result);
            }
        }// end if
        else {
            System.out.println(METHOD_SH + result);
            System.out.println(METHOD_TWIN + result);
            System.out.println(METHOD_MP + result);
        }
    }// end main
}// end class
