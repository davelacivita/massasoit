import java.util.Scanner;

public class OverloadedMethods_DL {
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int houseNumber;
        String streetName;
        String cityName;
        String stateName;
        int zipCode;
        long phoneNumber;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your first name.");
            firstName = keyboard.nextLine();
        System.out.println("Please enter your last name.");
            lastName = keyboard.nextLine();
        System.out.println("Please enter your street number.");
            houseNumber = keyboard.nextInt();
            keyboard.nextLine();
        System.out.println("Please enter your street name.");
            streetName = keyboard.nextLine();
        System.out.println("Please enter your city name.");
            cityName = keyboard.nextLine();
        System.out.println("Please enter your state name.");
            stateName = keyboard.nextLine();
        System.out.println("Please enter your zip code.");
            zipCode = keyboard.nextInt();
            keyboard.nextLine();
        System.out.println("Please enter your phone number.");
            phoneNumber= keyboard.nextLong();

        dataBase(firstName, lastName);
        System.out.println();
        dataBase(firstName, lastName, phoneNumber);
        System.out.println();
        dataBase(firstName, lastName, zipCode, phoneNumber);
        System.out.println();
        dataBase(firstName, lastName, houseNumber, streetName, cityName, stateName, zipCode, phoneNumber);
        System.out.println();

        keyboard.close();

    } //end main

    public static void dataBase(String first, String last) {
        System.out.println("First name is: " + first);
        System.out.println("Last name is: " + last);
    } //end method

    public static void dataBase(String first, String last, long phone) {
        System.out.println("First name: " + first);
        System.out.println("Last name: " + last);
        System.out.println("Phone number: " + phone);
    } //end method

    public static void dataBase(String first, String last,int zip, long phone) {
        System.out.println("First name: " + first);
        System.out.println("Last name: " + last);
        System.out.println("Zip code: 0" + zip);
        System.out.println("Phone number: " + phone);
    } //end method

    public static void dataBase(String first, String last, int num, String street, String city, String state, int zip, long phone) {
        System.out.println("First name: " + first);
        System.out.println("Last name: " + last);
        System.out.println("House number: " + num);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip code: 0" + zip);
        System.out.println("Phone number: " + phone);
    } //end method
} //end class
