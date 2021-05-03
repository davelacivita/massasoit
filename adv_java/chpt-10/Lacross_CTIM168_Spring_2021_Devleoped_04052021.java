
//import 
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lacross_CTIM168_Spring_2021_Devleoped_04052021 {
  public static void main(String[] args) {
    String homeTeamName, awayTeamName, winningTeam, losingTeam;
    int homeTeamScore, awayTeamScore;
    String fileName = "LacrossResults.txt"; // declare file to be read
    Scanner inputStream = null; // create new system input
    int count = 0;
    int n = 0;
    String[] names = null;
    Team[] league = null;
    String[] uniqueNames = null;

    // count the number of teams
    // try/catch block in case file isn't found
    try {
      inputStream = new Scanner(new File("LacrossResults.txt")); // assign the file to the input stream
    } catch (FileNotFoundException fnfe) {
      System.out.println("File not found, program will close.");
      System.exit(0);
    }

    while (inputStream.hasNextLine()) // while loop runs while the file still has a line to read
    {
      ++count; // counting the number of lines in the file
      inputStream.nextLine();
    } // end while

    // System.out.println(count);
    inputStream.close(); // closing the file

    names = new String[2 * count]; // new array with a length of 2x the number of lines

    // getting the team names
    try {
      inputStream = new Scanner(new File("LacrossResults.txt")); //
    } catch (FileNotFoundException fnfe) {
      System.out.println("File not found, program will close.");
      System.exit(0);
    }

    // reading team names and scores into memory
    while (inputStream.hasNextLine()) {
      names[n] = inputStream.next();
      ++n;
      inputStream.nextInt();
      names[n] = inputStream.next();
      ++n;
      inputStream.nextInt();
    } // end while

    // System.out.println(count);
    inputStream.close();

    // method to remove any duplicate team names
    uniqueNames = removeDuplicateElementString(names);

    // new array with signle occurance of team names
    league = new Team[uniqueNames.length];
    for (int i = 0; i < uniqueNames.length; ++i)
      league[i] = new Team(uniqueNames[i]);

    // reading the results
    try {
      inputStream = new Scanner(new File("LacrossResults.txt"));
    } catch (FileNotFoundException fnfe) {
      System.out.println("File not found, program will close.");
      System.exit(0);
    }

    while (inputStream.hasNextLine()) {
      awayTeamName = inputStream.next(); // assign first team name to away team
      awayTeamScore = inputStream.nextInt(); // assign away team's score
      homeTeamName = inputStream.next(); // assign team name to home team
      homeTeamScore = inputStream.nextInt(); // assign home team's score
      if (homeTeamScore > awayTeamScore) // assign winners and losers
      {
        winningTeam = homeTeamName;
        losingTeam = awayTeamName;
      } else {
        winningTeam = awayTeamName;
        losingTeam = homeTeamName;
      }

      for (int i = 0; i < league.length; ++i) {
        if (league[i].name.equals(winningTeam))
          ++league[i].wins;
        if (league[i].name.equals(losingTeam))
          ++league[i].loses;
      }
    } // end while loop

    for (int i = 0; i < league.length; ++i)
      System.out.println(league[i].toString());

  }// end main

  public static void bubbleSort(Team[] arr) {
    int n = arr.length;
    Team temp = null;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (arr[j - 1].name.compareTo(arr[j].name) > 0) {
          // swap elements
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        } // end if
      } // end for loop
    } // end for loop
  }// end method

  public static void bubbleSortArrayString(String[] arr) {
    int n = arr.length;
    String temp = null;
    for (int i = 0; i < n; i++) {
      for (int j = 1; j < (n - i); j++) {
        if (arr[j - 1].compareTo(arr[j]) > 0) {
          // swap elements
          temp = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = temp;
        } // end if
      } // end for loop
    } // end for loop
  }// end method

  public static String[] removeDuplicateElementString(String[] arr) {

    bubbleSortArrayString(arr); // sort the array of strings
    int n = arr.length;
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