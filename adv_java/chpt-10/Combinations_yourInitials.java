
// Java program that accept a string from the user and then write all the possible combinations of all the letters in the word entered to a file.
// 
import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

class Combinations_yourInitials {

    // function to write the permuted string to file
    public static void writeToFile(String str) {
        try {

            // Open given file in append mode.
            BufferedWriter out = new BufferedWriter(new FileWriter("Output_yourInitials.txt", true));

            // write string to file and close file
            out.write(str);
            out.close();
        } catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }

    // function to find all the combination of letters in the string
    public static void permutation(String prefix, String str) {
        int n = str.length();

        // when length of string equals 0, write the combination to file
        if (n == 0)
            writeToFile(prefix + "\n");

        // find the combination by fixing ith letter and permuting rest
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    // Main function
    public static void main(String args[]) {

        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        System.out.println("Enter string :  ");
        String s = in.nextLine();

        // get permutations of letters in string
        permutation("", s);

    }
}

//
// The classname is Combinations_yourInitials. To execute the program follow
// commands:
//
// javac Combinations_yourInitials.java
// java Combinations_yourInitials