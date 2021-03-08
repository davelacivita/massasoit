public class Golden extends Retriever
{
public String attitude;

public Golden()
{
super();
attitude = "unknown attitude";
}//end method

public Golden(String namePassed, String colorPassed, String coatPassed, String attitudePassed)
{
super(namePassed, colorPassed,  coatPassed);
attitude = attitudePassed;
}//end method

public void sleep()
{
System.out.println("I am sleeping");
}//end method

@Override
public void sayName() {
    System.out.println("My name is " + this.name);
    System.out.println("I'm needy!");
}
}//end class