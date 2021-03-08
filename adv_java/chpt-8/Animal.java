public class Animal
{
public String name;

//default constructor
public Animal()
{
name = "unknown";
}

//non-default constructor
public Animal(String namePassed)
{
name = namePassed;
}

public void sayName()
{
System.out.println("My name is " + this.name);
}

// public String getName() {
//     return this.name;

// }

}//end class