import java.util.Scanner;

public class ValidDate_DL
{
  public static void main(String[] args)
  {
  Scanner keyboard = new Scanner(System.in);
  String monthString, dayString, yearString, userInput;
  int monthInt, yearInt;
  boolean leap;

  System.out.println("Please enter a date in the following format: mm/dd/yyyy.");
  userInput = keyboard.nextLine();

  // test length
  if (userInput.length() != 10) {
    System.out.println("Invalid date due to length.");
  } // end if

  else if (!Character.isDigit(userInput.charAt(0)) || !Character.isDigit(userInput.charAt(1))
      || !Character.isDigit(userInput.charAt(3)) || !Character.isDigit(userInput.charAt(4))
      || !Character.isDigit(userInput.charAt(6)) || !Character.isDigit(userInput.charAt(7))
      || !Character.isDigit(userInput.charAt(8)) || !Character.isDigit(userInput.charAt(9))) {
    System.out.println("Invalid date due to invalid character");
  }
  System.exit(0);

  // test format
  if (userInput.charAt(2) != '/' || userInput.charAt(5) != '/') {
    System.out.println("Invalid date due to invalid format.");
  } // end if
  System.exit(0);

  monthString = userInput.substring(0, 2);
  dayString = userInput.substring(3, 5);
  yearString = userInput.substring(6);

  monthInt = Integer.parseInt(monthString);
  Integer.parseInt(dayString);
  yearInt = Integer.parseInt(yearString);

  // test day
  switch (monthInt) {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
      break;
    case 4:
    case 6:
    case 9:
    case 11:
      break;
    case 2:
      leap = ((yearInt % 4 == 0) && (yearInt % 100 != 0)) || (yearInt % 400 == 0);
      if (leap == true) {
      } else {
      }
      break;
    default:
      break;
      }

// test month
  if (monthInt < 1 || monthInt > 12) {
    System.out.println("Invalid date due to invalid month.");
    }
    keyboard.close();

  }//end main
}//end class
