import java.util.Scanner;
public class ZipCode_DL {
    public static void main(String[] args) {
        int d1, d2, d3, d4, d5;
        int zipOrg = getZip();

        d1=zipOrg/10000;
        zipOrg= zipOrg%10000;
        d2=zipOrg/1000;
        zipOrg=zipOrg%1000;
        d3=zipOrg/100;
        zipOrg=zipOrg%100;
        d4=zipOrg/10;
        zipOrg = zipOrg%10;
        d5 = zipOrg;

        int checkDigit = getCheckDigit( d1,  d2,  d3,  d4,  d5);
        System.out.println(checkDigit);


    } //end main

    public static int getZip() {
        Scanner keyboard = new Scanner(System.in);
        int input;
		do {
            System.out.println("Please enter a zip code between 00000 and 99999.");
            input = keyboard.nextInt();
        }
        while (input < 10000 || input > 99999);
        keyboard.close();
        return input;
    } // end getZip

    // public static int[] getDigits(int zipOrg) {
    //     int [] digits = new int[5];
    //     digits[0]=zipOrg/10000;
    //     zipOrg= zipOrg%10000;
    //     digits[1]=zipOrg/1000;
    //     zipOrg=zipOrg%1000;
    //     digits[2]=zipOrg/100;
    //     zipOrg=zipOrg%100;
    //     digits[3]=zipOrg/10;
    //     zipOrg = zipOrg%10;
    //     digits[4] = zipOrg;
    //     return digits;
    // } //end getDigit

    public static int getCheckDigit(int d1, int d2, int d3, int d4, int d5) {
        int sum = d1+d2+d3+d4+d5;
        int checkDigit = 10 -(sum%10);
        return checkDigit;
    } // end getCheckDigit


} //end class
