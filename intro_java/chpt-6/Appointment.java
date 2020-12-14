public class Appointment {
    //5 Instance variables:

private String month;
private int day;
private int year;
private int hour;
private int minute;
//default constructor

public Appointment() {
    month = "unknown";
    day=0;
    year=0;
    hour=0;
    minute=0;

}

 //1 non-default constructor that accepts arguments for all instance variables, your constructor must call the setter methods below to set the values of the instance variables

 public Appointment(String monthPassed, int dayPassed, int yearPassed, int hourPassed, int minutePassed) {
    month = monthPassed;
    day = dayPassed;
    year= yearPassed;
    hour= hourPassed;
    minute= minutePassed;
 }

//5 setter methods (one for each instance variable) with these limits:

//the setter for the month must determine if the 
//month passed is a valid month 
//(January - December), if not 
//trap the user until they enter a valid month

//public void setMonth(String monthPassed) {

//}end method

 

//the setter for hour must confirm that the hour is 
//between 0 and 23 (inclusive) if it is not
//trap the user until they enter a valid hour

//public void setHour(int hourPassed);

 

//the setter for year must confirm that the year 
//is >= 0 and <= 2020, if it is not
//trap the user until they enter a valid year

//public void setYear(int yearPassed);

 

//the setter for minute must confirm that the 
//minute is between 0 and 59 (inclusive) if it is 
//not trap the user until they enter a valid minute

//public void setMinute(int minutePassed);

 

//the setter for day must confirm that the 
//day is a valid day for the month and year passed
//if it is not trap the user to enter a valid day for the month
//and year passed to the method (i.e. do not have the user
//reenter the month and year, they are to reenter the day only)
//remember to check if the year is a leap year

//public void setDay(int dayPassed, String monthPassed, int yearPassed);

 

//5 getter methods (one for each instance variable) that return the value of the variable

public String getMonth() {
return this.month;
} //end method

public int getDay() {
return this.day;
}
public int getYear() {
return this.year;
}

public int getHour(){
return this.hour;
}

public int getMinute() {
return this.minute;
}

// 1 toString method
public String toString() {
   return "\nMonth" + this.getMonth() + 
   "\nDay: " + this.getDay() + 
   "\nYear: " + this.getYear() + 
   "\nHour: " + this.getHour() + 
   "\nMinute: " + this.getMinute();
   
} //end method

// 1 equals method
// 
//  public boolean equals(Appointment appointmentPassed)
}
