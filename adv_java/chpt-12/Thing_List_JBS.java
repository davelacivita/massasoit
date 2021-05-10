// A linked list can be used to represent  a stack.  Think of a stack of dishes, 
// the first dish put onto the stack is at the bottom, at the top is the last dish put on the stack.
// 
// This assignment requires you to create a singly linked list of Things.   
// The class Thing should be as follows:
// 
// public class Thing
// {
// private String description;
// private Thing next;
// 
// public Thing()
// {
// description = null;
// thing = null;
// }//end constructor
// 
// public Thing(String newDescription, thing linkValue)
// {
// description = newDescription;
// thing = linkValue;
// }//end constructor
// 
// }//end class
// 
// Write a program (name it ThingList_yourInitials.java (where yourInitials represents your initials) in which you are to:
// 
// ask the user if they would like to add a Thing
// if they answer yes your code should ask for a String,
// create a new Thing saving the string entered to the variable name for the Thing created
// append the Thing created to the linked list
// repeat until the user does not want to add another Thing
// remove the last Thing added to the list and print the value of 'description" for that thing
// print the descriptions of the remaining Things in the list
// repeat until there are no more Things on the lsit
// Example:
// 
// Even a list:
// 
// 'a' -> 'b' -> 'c' -> 'd' -> 'e' -> 'f'
// 
// The output would be:
// 
// f
// 
// a b c d e
// 
// e
// 
// a b c d
// 
// d
// 
// a b c 
// 
// c
// 
// a b
// 
// b
// 
// a
// 
// a

// Node p = new Node("Mercury");
// Node q = p;
// 
// Node r = new Node("Venus");
// q.next = r;
// q = r;

import java.util.Scanner;

public class Thing_List_JBS {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String userInput;
        boolean again;
        Thing p = null, q = null, r = null, current = null, previous = null, last = null;

        // to establish that we have a linked list
        System.out.println("Would you like to add a Thing to a linked list of Things, enter true or false.");
        again = keyboard.nextBoolean();
        keyboard.nextLine();// Flush Line
        // add the first Thing
        if (again) {
            System.out.println("Please enter the description:");
            userInput = keyboard.nextLine();
            p = new Thing(userInput, null);
            q = p;
        } // end if
        else {
            System.out.println("Thank you, program will close.");
            System.exit(0);
        } // end else

        // add things to list
        System.out.println("Would you like to add another Thing to the linked list of Things, enter true or false.");
        again = keyboard.nextBoolean();
        keyboard.nextLine();// Flush Line
        while (again) {
            System.out.println("Please enter the description:");
            userInput = keyboard.nextLine();
            r = new Thing(userInput, null);
            q.setNext(r);
            q = r;
            System.out
                    .println("Would you like to add another Thing to the linked list of Things, enter true or false.");
            again = keyboard.nextBoolean();
            keyboard.nextLine();// Flush Line
        } // end while

        printLinkedListOfThings(current);


        // remove and print
        while (current != null) {
            popListOfThings(p, p);
            printLinkedListOfThings(current);
        } // end outer while
    }// end main

    // method to pop and then call print

    public static void popListOfThings(Thing pPassed, Thing currentPassed) {
        Thing previous = pPassed;
        while (currentPassed.getNext() != null) {
            System.out.println(currentPassed.getDescription());
            printLinkedListOfThings(currentPassed);
            previous = currentPassed;
            currentPassed = currentPassed.getNext();
            previous.setNext(null);
        } // end while
    }// end method

    public static void printLinkedListOfThings(Thing thingPassed) {
        while (thingPassed != null) {
            System.out.print(thingPassed.getDescription() + "-->");
            thingPassed = thingPassed.getNext();
        } // end while
        System.out.println();
    }// end method
}// end class