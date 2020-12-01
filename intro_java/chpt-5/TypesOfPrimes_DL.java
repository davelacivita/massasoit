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
            // Sophie Germaine Prime: a number n such that n and 2 * n + 1 are both prime
            boolean isSophieGermainPrime = true;
            int y = (2*n) + 1;
            if (determineIfPrime(y) == true) {
                return isSophieGermainPrime;
            }
            else {
                return false;
            }
        }// end method

        public static boolean isTwinPrime(int n) {
            // Twin Prime: a number n such that n and n + 2 are both prime
            boolean isTwinPrime = true;
            int y = n + 2;
            if (determineIfPrime(y) == true) {
                return isTwinPrime;
            }
            else {
                return false;
            }
        }// end method

        public static boolean isMersennePrime(int n) {
            // Mersenne Prime: a prime number n such that 2n - 1 is also prime
            boolean isMersennePrime = true;
            int y = 2*n - 1;
            if (determineIfPrime(y) == true) {
                return isMersennePrime;
            }
            else {
                return false;
            }
        }//end method
} // end class