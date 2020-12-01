import java.util.Scanner;

public class Seconds_DL
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);

    // declare variables

    long seconds, years, days, hours, minutes, orgSeconds;


    // user input

    System.out.println("Please enter the number of seconds you would like calculated: ");
    seconds = keyboard.nextLong();
    orgSeconds = seconds;

    // calculations

    years = seconds/31536000;
    seconds = seconds%31536000;
    days = seconds/86400;
    seconds = seconds%86400;
    hours = seconds/3600;
    seconds = seconds%3600;
    minutes = seconds/60;
    seconds = seconds%60;

    // outputs

    System.out.println("For " + orgSeconds + " you will have: ");
    System.out.println("Years: " + years);
    System.out.println("Days: " + days);
    System.out.println("Hours: " + hours);
    System.out.println("Minutes: " + minutes);
    System.out.println("Seconds: " + seconds);
    keyboard.close();
  }//end main
}//end class
