import java.util.Random;

public class SecretNumber_DL {
  public static void main(String[] args) {
    Random rng = new Random();
    int nOrg, n, d4, d3, d2, d1;
    nOrg = rng.nextInt(10000);
    n = nOrg;

    d4=n/1000;
    n= n%1000;
    d3=n/100;
    n=n%100;
    d2=n/10;
    n=n%10;
    d1=n;

    //for (n=3001; n <= 9999; n=n+2) {
      if (n%2==0) {
        nOrg = rng.nextInt(10000);
        n = nOrg;

        d4=n/1000;
        n= n%1000;
        d3=n/100;
        n=n%100;
        d2=n/10;
        n=n%10;
        d1=n;
        // continue;
      } // end if

      if (d1==d2||d1==d3||d1==d4||d2==d3||d2==d4||d3==d4) {
        nOrg = rng.nextInt(10000);
        n = nOrg;

        d4=n/1000;
        n= n%1000;
        d3=n/100;
        n=n%100;
        d2=n/10;
        n=n%10;
        d1=n;
        // continue;
      } // end if
      if (d2*3!=d4) {
        nOrg = rng.nextInt(10000);
        n = nOrg;

        d4=n/1000;
        n= n%1000;
        d3=n/100;
        n=n%100;
        d2=n/10;
        n=n%10;
        d1=n;
        //continue;
      } // end if
      if (d4+d3+d2+d1!=27) {
        nOrg = rng.nextInt(10000);
        n = nOrg;

        d4=n/1000;
        n= n%1000;
        d3=n/100;
        n=n%100;
        d2=n/10;
        n=n%10;
        d1=n;
      //  continue;
      } // end if


    //}// end for loop
    System.out.println("The secret number is " + nOrg);

  }
}
