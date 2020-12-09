import java.util.Scanner;

public class ValidDate_DL
{
  public static void main(String[] args)
  {
  Scanner keyboard = new Scanner(System.in);
  String monthString, dayString, yearString, userInput;
  int dayInt, monthInt, yearInt, maxDays;
  boolean leap;

  System.out.println("Please enter a date in the following format: mm/dd/yyyy.");
  userInput = keyboard.nextLine();
  keyboard.close();

  // test length
  if (userInput.length() != 10) {
    System.out.println("Invalid date due to length.");
    System.exit(0);
    } // end if


  else if (
  !Character.isDigit(userInput.charAt(0))
  ||
  !Character.isDigit(userInput.charAt(1))
  ||
  !Character.isDigit(userInput.charAt(3))
  ||
  !Character.isDigit(userInput.charAt(4))
  ||
  !Character.isDigit(userInput.charAt(6))
  ||
  !Character.isDigit(userInput.charAt(7))
  ||
  !Character.isDigit(userInput.charAt(8))
  ||
  !Character.isDigit(userInput.charAt(9))
  )
  {
    System.out.println("Invalid date due to invalid character");
    System.exit(0);
  }



  // test format
  if (userInput.charAt(2) != '/' || userInput.charAt(5) != '/'){
    System.out.println("Invalid date due to invalid format.");
    System.exit(0);
    } // end if
  else {
    monthString = userInput.substring(0,2);
    dayString = userInput.substring(3,5);
    yearString = userInput.substring(6);
  
    monthInt = Integer.parseInt(monthString);
    dayInt = Integer.parseInt(dayString);
    yearInt = Integer.parseInt(yearString);
  
    // test month
    if (monthInt < 1 || monthInt > 12) {
      System.out.println("Invalid date due to invalid month.");
      System.exit(0);
      }
    // test day
        switch (monthInt) {
          case 1:
          case 3:
          case 5:
          case 7:
          case 8:
          case 10:
          case 12:
            maxDays = 31;
            break;
          case 4:
          case 6:
          case 9:
          case 11:
            maxDays = 30;
            break;
          case 2:
            leap = ((yearInt % 4 == 0) && (yearInt % 100 != 0)) || (yearInt % 400 == 0);
            if (leap == true) {
              maxDays = 29;
              }
              else
                maxDays = 28;
              break;
          default:
            maxDays = 1;
            break;
        }
  
  // test day
  if (dayInt < 1 || dayInt > maxDays) {
    System.out.println("Invalid date due to invalid day.");
  }
  else {
    System.out.println("Valid date.");
  }
  }//end else

  }//end main
}//end class
