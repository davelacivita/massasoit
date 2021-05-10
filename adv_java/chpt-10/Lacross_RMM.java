import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lacross_RMM {
  public static void main(String[] args) {

    String homeTeamName, awayTeamName, winningTeam, losingTeam;
    int homeTeamScore, awayTeamScore;

    // external file used
    String fileName = "LacrossResults.txt";
    Scanner inputStream = null;
    int count = 0;
    String[] names = null;

    Team[] league = { new Team("Sedona"), new Team("Tulsa"), new Team("Pittsburgh") };

    for (int i = 0; i < league.length; ++i)
      System.out.println(league[i].toString());

    // count the number of teams
    try {
      inputStream = new Scanner(new File("LacrossResults.txt"));
    } // end try

    catch (FileNotFoundException fnfe) {
      System.out.println("File not found: program will close.");
      System.exit(0);
    } // end catch

    while (inputStream.hasNextLine()) {
      ++count;
      inputStream.nextLine();
    } // end while

    inputStream.close();

    // reading the results
    try {
      inputStream = new Scanner(new File("LacrossResults.txt"));
    } // end try

    catch (FileNotFoundException fnfe) {
      System.out.println("File not found: program will close.");
      System.exit(0);
    } // end catch

    while (inputStream.hasNextLine()) {
      awayTeamName = inputStream.next();
      awayTeamScore = inputStream.nextInt();
      homeTeamName = inputStream.next();
      homeTeamScore = inputStream.nextInt();

      // sets teams
      if (homeTeamScore > awayTeamScore) {
        winningTeam = homeTeamName;
        losingTeam = awayTeamName;
      } // end if

      else {
        winningTeam = awayTeamName;
        losingTeam = homeTeamName;
      } // end else

      for (int i = 0; i < league.length; ++i) {
        if (league[i].name.equals(winningTeam))
          ++league[i].wins;
        if (league[i].name.equals(losingTeam))
          ++league[i].loses;
      } // end if
    } // end while loop

    System.out.println("_____________________");
    for (int i = 0; i < league.length; ++i)
      System.out.println(league[i].toString());

    // bubble sorting occurs
    bubbleSort(league);
    System.out.println("_____________________");
    for (int i = 0; i < league.length; ++i)
      System.out.println(league[i].toString());
  }// end main

  public static void bubbleSort(Team[] arr) {

    int n = arr.length;
    Team temp = null;

    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - 1); j++) {
        if (arr[j - 1].name.compareTo(arr[j].name) > 0) // comparing team names
        {
          // swap elements
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        } // end if
      } // end for loop
    } // end for leep
  }// end main

  public static String[] removeDuplicateElementString(String[] arr) {

    int n = arr.length; // sorts the array of strings

    if (n == 0 || n == 1)
      return arr;

    String[] temp = new String[n];
    int j = 0;

    for (int i = 0; i < n - 1; i++)
      if (arr[i].compareTo(arr[i + 1]) != 0)
        temp[j++] = arr[i];
    temp[j++] = arr[n - 1];

    // Changing original array
    for (int i = 0; i < j; i++)
      arr[i] = temp[i];

    String[] nonDuplicateArray = new String[j];
    for (int i = 0; i < j; ++i)
      nonDuplicateArray[i] = arr[i];

    return nonDuplicateArray;
  }// end method

}// end class