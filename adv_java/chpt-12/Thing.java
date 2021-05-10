public class Thing
{
private String description;
private Thing next;

public Thing()
{
description = null;
next = null;
}//end constructor

public Thing(String newDescription, Thing linkValue)
{
description = newDescription;
next = linkValue;
}//end constructor

public void setNext(Thing thingPassed)
{
this.next = thingPassed;
}//end method

public String getDescription()
{
return this.description;
}//end method

public Thing getNext()
{
return this.next;
}//end method

}//end class
