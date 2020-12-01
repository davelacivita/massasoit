public class PrimeMethodsDemo_DL {
    public static void main(String[] args) {
        boolean result = true;
        boolean isPrime = true;

        String METHOD_PRIME = "Prime: ";
        String METHOD_SG = "Sophie Germain: ";
        String METHOD_TWIN = "Twin Prime: ";
        String METHOD_MP = "Mersenne Prime: ";

        int input = TypesOfPrimes_DL.getInput();
        result = (TypesOfPrimes_DL.determineIfPrime(input));
        isPrime = result;
        System.out.println(METHOD_PRIME + result);

        if (isPrime == true ) {
            result = (TypesOfPrimes_DL.isSophieGermainPrime(input));
            System.out.println(METHOD_SG + result);
            
            result = (TypesOfPrimes_DL.isTwinPrime(input)); 
            System.out.println(METHOD_TWIN + result);
            
            result = (TypesOfPrimes_DL.isMersennePrime(input)); 
            System.out.println(METHOD_MP + result);
            }//end if
        else {
            result = false;
                System.out.println(METHOD_SG + result);
                System.out.println(METHOD_TWIN + result);
                System.out.println(METHOD_MP + result);
        }//end else
     
        
    }// end main
}// end class
