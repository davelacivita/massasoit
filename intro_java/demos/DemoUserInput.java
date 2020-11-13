package demos;

import java.util.Scanner;

public class DemoUserInput
{
  public static void main(String[] args) throws Exception
  {
    Scanner keyboard = new Scanner(System.in);
    // accept String
    // next(); // next word
    // nextLine(); // includes return
    String firstName;
    String lastName;
    int age;
    boolean opinion;
    char middleInitial;
    int houseNumber;
    String street;

    System.out.println("Please enter your first name");
    firstName = keyboard.nextLine();

    System.out.println("Please enter your last name");
    lastName = keyboard.nextLine();

    System.out.println("Please enter your age");
    age = keyboard.nextInt();

    System.out.println("Java is easy to learn, enter true or false");
    opinion = keyboard.nextBoolean();

    System.out.println("Enter house number ");
    houseNumber = keyboard.nextInt();

    keyboard.nextLine();
    // flush the line when going from nextInt (primative) to nextLine the return is left hanging

    System.out.println("Please enter middle initial");
    middleInitial = (char)System.in.read();
    keyboard.nextLine();

    System.out.println("please enter your steet name ");
    street = keyboard.nextLine();

    System.out.println(lastName);
    System.out.println(firstName);
    System.out.println(age);
    System.out.println(opinion);
    System.out.println(houseNumber);
    System.out.println(middleInitial);
    System.out.println(street);

    keyboard.close();


  }
}
