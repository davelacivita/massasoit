import java.util.Scanner;
public class ZipCode_DL {
    public static void main(String[] args) throws Exception {
        int d1, d2, d3, d4, d5;
        boolean answer = true;
        char response;

        while (answer == true) {

        int zipOrg = getZip();
        int zip = zipOrg;

        d1=zipOrg/10000;
        zipOrg= zipOrg%10000;
        d2=zipOrg/1000;
        zipOrg=zipOrg%1000;
        d3=zipOrg/100;
        zipOrg=zipOrg%100;
        d4=zipOrg/10;
        zipOrg = zipOrg%10;
        d5 = zipOrg;

        int checkDigit = getCheckDigit(d1,  d2,  d3,  d4,  d5);
        System.out.printf("The bar code for the zip code %05d is: \n", zip );
        printPipe();
        printCode(d1);
        printCode(d2);
        printCode(d3);
        printCode(d4);
        printCode(d5);
        printCode(checkDigit);
        printPipe();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Would you like to enter another zip code? (y or n)");
        response = (char)System.in.read();
        if (response == 'y') {
            answer = true;
        }
        else {
            answer = false;
            keyboard.close();
        }
        } // end while
    } //end main

    public static int getZip() {
        Scanner keyboard = new Scanner(System.in);
        int input;
		do {
            System.out.println("Please enter a zip code between 00000 and 99999.");
            input = keyboard.nextInt();
        }
        while (input < 0 || input > 99999);
        return input;
    } // end getZip


    public static int getCheckDigit(int d1, int d2, int d3, int d4, int d5) {
        int sum = d1+d2+d3+d4+d5;
        int checkDigit = 10 - (sum%10);
        return checkDigit;
    } // end getCheckDigit

    public static void printCode(int value) {
        int digit = value;
        switch (digit) {
            case 1:
            System.out.print(":::||");
            break;
            case 2:
            System.out.print("::|:|");
            break;
            case 3:
            System.out.print("::||:");
            break;
            case 4:
            System.out.print(":|::|");
            break;
            case 5:
            System.out.print(":|:|:");
            break;
            case 6:
            System.out.print(":||::");
            break;
            case 7:
            System.out.print("|:::|");
            break;
            case 8:
            System.out.print("|::|:");
            break;
            case 9:
            System.out.print("|:|::");
            break;
            default:
            System.out.print("||:::");
            break;
        }
    } // end printCode

    public static void printPipe() {
        System.out.print("|");
    }

} //end class
