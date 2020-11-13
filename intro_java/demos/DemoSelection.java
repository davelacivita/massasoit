package demos;

public class DemoSelection {
  public static void main(String[] args) {
    int n = 3;
    // sequential
    if (n > 0) {
      System.out.println("Greater");
    } // end if
    if (n == 0)
    {
      System.out.println("Equals");
    } // end if
    // nested
    n = 40;
    {
      if (n > 10)
        if (n > 20)
          if (n > 30)
            System.out.println("Nice work");
    } // end if
    n = 10;
    if (n == 50)
    {
      System.out.println("Nice work");
    } // end if
    else
      {System.out.println("Try harder");
    } // end else

    // else if
    n = 40;
      if (n > 90)
      {System.out.println("A");
    } // end if
    else if (n > 80)
      {
        System.out.println("B");
      }
      else if (n > 70)
        {
          System.out.println("C");
        }
        else if (n > 60)
          {
            System.out.println("D");
          }
    else
      {
        System.out.println("F");
      }
// switch
n = 1;
  switch(n)
  {
    case 1:
      System.out.println("low");
      break;
        case(2):
        System.out.println("");

  }
    }
}
