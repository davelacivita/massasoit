public class Lab extends Retriever
{
public String intelligence;

public Lab()
{
super();
intelligence = "unknown intelligence";
}//end method

public Lab(String namePassed, String colorPassed, String coatPassed, String intelligencePassed)
{
super(namePassed, colorPassed,  coatPassed);
intelligence = intelligencePassed;
}//end method

public void drool()
{
System.out.println("I am drooling");
}//end method
}//end class