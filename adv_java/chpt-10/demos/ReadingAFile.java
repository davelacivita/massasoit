package demos;


import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileReader;

public class ReadingAFile {
	
	public static void main(String[] args)
	{
		int numberRead;
		Scanner inputStream = null;
		try
		{
		inputStream = new Scanner
			(new FileReader("numbers.txt"));
		}
		catch(FileNotFoundException e)
		{
		System.out.println("File not found, program to close");
		System.exit(0);
		}//end catch
		
		while(inputStream.hasNextInt())
		{
		numberRead = inputStream.nextInt();	
		System.out.println(numberRead);
		}//end while
		
		inputStream.close();
		
	}//end main
}//end class