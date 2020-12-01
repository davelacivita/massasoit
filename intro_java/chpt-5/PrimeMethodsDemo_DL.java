import java.util.Scanner;

public class PrimeMethodsDemo_DL {
    public static void main(String[] args) {
        boolean result = true;
        boolean isPrime = true;

        String METHOD_PRIME = "Prime: ";
        String METHOD_SG = "Sophie Germain: ";
        String METHOD_TWIN = "Twin Prime: ";
        String METHOD_MP = "Mersenne Prime: ";

        int input = getInput();
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


    public static int getInput() {        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Plese enter an intereger.");
        int input = keyboard.nextInt();
        keyboard.close();
        return input;
    }// end method
}// end class
