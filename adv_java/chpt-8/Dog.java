public class Dog extends Animal
{
public String color;

public Dog()
{
super();
color = "unknown color";
}//end method

public Dog(String namePassed, String colorPassed)
{
super(namePassed);
color = colorPassed;
}//end method

public void bark()
{
System.out.println("Bark");
}//end method
}//end class