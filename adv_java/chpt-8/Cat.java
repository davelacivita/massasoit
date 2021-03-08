public class Cat extends Animal
{
public String status;

//default constructor
public Cat()
{
super();
status = "unknown status";
}//end method

//non-default constructor
public Cat(String namePassed, String statusPassed)
{
super(namePassed);
status = statusPassed;
}//end method

public void meow()
{
System.out.println("Meow");
}//end method

}//end class