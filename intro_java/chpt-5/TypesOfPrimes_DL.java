public class TypesOfPrimes_DL {

        public static boolean determineIfPrime(int valuePassed) {
            boolean isPrime = true;
            if(valuePassed < 2) {
                isPrime = false;
            }//end if
            else {
                if(valuePassed == 2) {
                    isPrime = true;
                }//end if
                else {
                    for(int i = 2; i < Math.sqrt(valuePassed) + 1; ++i) {
                        if(valuePassed % i == 0) {
                            return false;
                        }//end if
                    }//end for loop
                }//end else
            }//end else
            return isPrime;
        }// end method

        public static boolean isSophieGermainPrime(int n) {
            return determineIfPrime(n) && determineIfPrime(2*n+1);
        }// end method

        public static boolean isTwinPrime(int n) {
            return determineIfPrime(n) && determineIfPrime(n+2);
        }// end method

        public static boolean isMersennePrime(int n) {
            return determineIfPrime(n) && determineIfPrime(2*n-1);
        }//end method
} // end class