import java.util.Scanner;

public class Appointment {
    //5 Instance variables:

private String month;
private int day;
private int year;
private int hour;
private int minute;
//default constructor

public Appointment() {
    setMonth("January");
    setDay(1, "January", 1);
    setYear(1);
    setHour(1);
    setMinute(1);

}

 //1 non-default constructor that accepts arguments for all instance variables, your constructor must call the setter methods below to set the values of the instance variables

 public Appointment(String monthPassed, int dayPassed, int yearPassed, int hourPassed, int minutePassed) {
    setMonth(monthPassed);
    setDay(dayPassed, getMonth(), yearPassed);
    setYear(yearPassed);
    setHour(hourPassed);
    setMinute(minutePassed);
 }

//5 setter methods (one for each instance variable) with these limits:

//the setter for the month must determine if the 
//month passed is a valid month 
//(January - December), if not 
//trap the user until they enter a valid month

public void setMonth(String monthPassed) {
    //Scanner keyboard = new Scanner(System.in);
    //monthPassed = keyboard.nextLine();
    while (
        monthPassed.equals ("January") == false
        &&
        monthPassed.equals ("February") == false
        &&
        monthPassed.equals ("March") == false
        &&
        monthPassed.equals ("April") == false
        &&
        monthPassed.equals ("May") == false
        &&
        monthPassed.equals ("June") == false
        &&
        monthPassed.equals ("July") == false
        &&
        monthPassed.equals ("August") == false
        &&
        monthPassed.equals ("September") == false
        &&
        monthPassed.equals ("October") == false
        &&
        monthPassed.equals ("November") == false
        &&
        monthPassed.equals ("December") == false
    )// end while
    System.out.println("Please enter January - December");
    //keyboard.close();
}//end method

 

//the setter for hour must confirm that the hour is 
//between 0 and 23 (inclusive) if it is not
//trap the user until they enter a valid hour

public void setHour(int hourPassed) {
    while (hourPassed < 0 || hourPassed > 23) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Invalid hour, please use military time, 0-23");
        hourPassed = keyboard.nextInt();
        keyboard.close();
    }// end while
    this.hour =hourPassed;
}// end method
 

//the setter for year must confirm that the year 
//is >= 0 and <= 2020, if it is not
//trap the user until they enter a valid year

public void setYear(int yearPassed) {
    while (yearPassed < 0 || yearPassed > 2020) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Invalid year, 0-2020.");
        yearPassed = keyboard.nextInt();
        keyboard.close();
    }// end while
    this.year = yearPassed;
}

 

//the setter for minute must confirm that the 
//minute is between 0 and 59 (inclusive) if it is 
//not trap the user until they enter a valid minute

public void setMinute(int minutePassed) {
    while (minutePassed < 0 || minutePassed > 59) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Invalid minte, please use 0-59");
        minutePassed = keyboard.nextInt();
        keyboard.close();
    }// end while
    this.minute = minutePassed;
}

 

//the setter for day must confirm that the 
//day is a valid day for the month and year passed
//if it is not trap the user to enter a valid day for the month
//and year passed to the method (i.e. do not have the user
//reenter the month and year, they are to reenter the day only)
//remember to check if the year is a leap year

public void setDay(int dayPassed, String monthPassed, int yearPassed) {
    while (validNumberDays(dayPassed, monthPassed, yearPassed) == false) {
        System.out.println("Please enter a correct day for the month entered.");
    }// end while
}//end method


public boolean validNumberDays (int dayPassed, String monthPassed, int yearPassed) {
    boolean leap = ((yearPassed% 4 == 0) && yearPassed % 100 != 0) || (yearPassed% 400 == 0);
    if (leap == true);
    int maxDays;
    switch(monthPassed) {
        case "January":
        case "March":
        case "May":
        case "July":
        case "August":
        case "October":
        case "December":
            maxDays = 31;
            break;
        case "April":
        case "June":
        case "September":
        case "November":
            maxDays = 30;
            break;
        case "February":
            if (leap == true) {
                maxDays = 29;
            }
            else 
                maxDays = 28;
            break;
        default:
            maxDays = 31;
            break;
    }// end Switch
    return dayPassed >= maxDays || dayPassed > 0;

}// end method

 

//5 getter methods (one for each instance variable) that return the value of the variable

public String getMonth() {
return this.month;
} //end method

public int getDay() {
return this.day;
} //end method
public int getYear() {
return this.year;
} //end method

public int getHour(){
return this.hour;
} //end method

public int getMinute() {
return this.minute;
} //end method

// 1 toString method
public String toString() {
   return "\nMonth: " + this.getMonth() + 
   "\nDay: " + this.getDay() + 
   "\nYear: " + this.getYear() + 
   "\nHour: " + this.getHour() + 
   "\nMinute: " + this.getMinute();
   
} //end method

// 1 equals method
// 
//  public boolean equals(Appointment appointmentPassed)
}
