import java.util.Scanner;
public class ZipCode_DL {
    public static void main(String[] args) {
        int zipOrg, input;

        getZip();
        getDigit(input);



    } //end main

    public static int getZip() {
        System.out.println("Please enter a zip code between 00000 and 99999.");
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        if (input < 0 && input > 99999) {
            System.out.println("Please enter a zip code between 00000 and 99999.");
            input = keyboard.nextInt();
        } //end for 

        keyboard.close();
        return input;

    } //end getZip

    public static int getDigit(int zipOrg) {
        int d1, d2, d3, d4, d5;

        d1=zipOrg/10000;
        zipOrg= zipOrg%10000;
        d2=zipOrg/1000;
        zipOrg=zipOrg%1000;
        d3=zipOrg/100;
        zipOrg=zipOrg%100;
        d4=zipOrg/10;
        zipOrg = zipOrg%10;
        d5 = zipOrg;
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        getCheckDigit(d1, d2, d3, d4, d5);


        return getDigit(zipOrg);

    } //end getDigits

    public static int getCheckDigit(int d1, int d2, int d3, int d4, int d5) {
        int sum = d1+d2+d3+d4+d5;
        int checkDigit = 10 -(sum%10);
        System.out.println(checkDigit);

        return checkDigit;

    }

    
} //end class
