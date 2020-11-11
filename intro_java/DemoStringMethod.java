import java.util.Random;
public class DemoStringMethod
{
  public static void main(String[] args) {
    // variables
    Random RNG = new java.util.Random();
    String myString = "Boston", frontPort, backPort;
    int lengthOfString = myString.length();
    int position = RNG.nextInt(lengthOfString);

    // split the String
    frontPort = myString.substring(0, position);
    backPort = myString.substring(position);
    myString = backPort + frontPort;
    System.out.println(myString);
  } // end main
} //end Class 
