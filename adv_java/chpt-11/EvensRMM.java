// Program contains-
// A function called evens() which is recursive in nature to print all the even numbers in between [0,n]
// A driver function called main() takes the input from the user as well as validates the input.
// 
// 
// Down below is the required program including Question_1 and Question_2 :
// 
import java.util.*;
public class Main
{
    //to count to number of even number in [0,n]
    static int counter=0;
    static int num;
    public static int evens(int n)
    {
        // Base case
        if(n<0)
        {
            return 0;
        }
        
        //here we are printing even numbers
        if (n % 2 == 0)
        {
            counter++;
            System.out.print(n + " ");
        }
          
        //if n is even
        if(n % 2 == 0 )
        {
            evens(n-2);
        }
        else    //if n is odd
        {
            evens(n-1);
        }
        
        return counter;
    }
    
     
    // Driver Code
    public static void main(String[] args)
    {
        boolean valid = false;

        //this loop will keep the user trapped until he enters a valid input
        do{
            //taking input from the user
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Limit ( a positive number ) :");
            
            //if and only if user entered a number
            if(sc.hasNextInt())
            {
                num = sc.nextInt();
                valid = true;
                
            }
            else if(sc.hasNext())       //if user entered a character or string
            {
                System.out.println("Invalid input! Please enter again!");
            } 
        }while(valid==false);

        System.out.print("Even numbers from 0 to "+num+" : ");
        
        evens(num);
        System.out.println();
        
        System.out.println("Number of even numbers between 0 to "+num+" is : "+counter);
     
        return;
    }
// }
// I've added all the necessary comments for better clarity. Just a little complexity is in the do-while loop otherwise rest of the program is pretty straightforward.
// Still, if you have any doubts, feel free to ask them in the comments section.
// 
// Do share your feedback if you find this helpful.
// Thanks and All the Best!