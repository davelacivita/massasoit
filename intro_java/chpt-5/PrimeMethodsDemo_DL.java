import java.util.Scanner;

public class PrimeMethodsDemo_DL {
    public static void main(String[] args) {
        int input = getInput();

        String PRIME = "Prime: ";
        String SG = "Sophie Germain: ";
        String TWIN = "Twin Prime: ";
        String MP = "Mersenne Prime: ";

        System.out.println(PRIME + TypesOfPrimes_DL.determineIfPrime(input));
        System.out.println(SG + TypesOfPrimes_DL.isSophieGermainPrime(input));
        System.out.println(TWIN + TypesOfPrimes_DL.isTwinPrime(input));
        System.out.println(MP + TypesOfPrimes_DL.isMersennePrime(input));

    }// end main


    public static int getInput() {        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Plese enter an intereger.");
        int input = keyboard.nextInt();
        keyboard.close();
        return input;
    }// end method
}// end class
