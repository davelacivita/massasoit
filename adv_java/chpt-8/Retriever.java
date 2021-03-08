public class Retriever extends Dog
{
public String coat;

public Retriever()
{
super();
coat = "unknown coat";
}//end constructor 

public Retriever(String namePassed, String colorPassed, String coatPassed)
{
super(namePassed, colorPassed);
coat = coatPassed;
}//end constructor 

public void jump()
{
System.out.println("I am jumping");
}//end method

}//end class