// Following are the required classes. Compile the Exception classes before compiling the driver class. Comments have been added for better understanding.
// 
// UnderflowException.java
// 
// //This Exception class should be used when an Undeflow happens while performing arithmetic operations with Integers
// class UnderflowException extends Exception{
//     String message;
// 
//     //constructor
    UnderflowException( String str) {
        message = str;
    }

    //toString function to print the exception
    public String toString() {
        return ("Integer Underflow Exception Occured: "+message);
    }
}
OverflowException.java

//This Exception class should be used when an Overflow happens while performing arithmetic operations with Integers
class OverflowException extends Exception{
    String message;

    //constructor
    OverflowException( String str) {
        message = str;
    }

    //toString function to print the exception
    public String toString() {
        return ("Integer Overflow Exception Occured: "+message);
    }
}
UnderOver_yourInitials.java


import java.util.*;

//Driver Class: rename it by replacing it with your initials
class UnderOver_yourInitials{

    //Driver method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Scanning 2 integers from user input
        Integer a, b;
        System.out.print("Enter first integer: ");
        a = sc.nextInt();
        System.out.print("Enter second integer: ");
        b = sc.nextInt();
        long sum, sub;

        //Throwing exceptions accordingly
        try{
            sum = (long)a + (long)b;
            if(sum < Integer.MIN_VALUE)
                throw new UnderflowException("sum of "+ a.toString()+ " and "+ b.toString()+" is less than -2147483648");
            else if( sum > Integer.MAX_VALUE)
                 throw new OverflowException("sum of "+ a.toString()+ " and "+ b.toString()+" is more than 2147483647");
            else
                System.out.println("sum of "+ a.toString()+ " and "+ b.toString()+" is: "+ sum);
        
            sub = (long)a - (long)b;
            if(sub < Integer.MIN_VALUE)
                throw new UnderflowException("difference of "+ a.toString()+ " and "+ b.toString()+" is less than -2147483648");
            else if( sub > Integer.MAX_VALUE)
                 throw new OverflowException("difference of "+ a.toString()+ " and "+ b.toString()+" is more than 2147483647");
            else
                System.out.println("difference of "+ a.toString()+ " and "+ b.toString()+" is: "+ sub);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}