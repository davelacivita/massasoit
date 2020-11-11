public class SecretNumber_DL1 {
  public static void main(String[] args) {

    int nOrg = 0, d4, d3, d2, d1;

    for (int n=3015; n <=9875 ; n=n+2) {
      nOrg = n;
        d4=n/1000;
        n= n%1000;
        d3=n/100;
        n=n%100;
        d2=n/10;
        n=n%10;
        d1=n;

        // if (d1==d2||d1==d3||d1==d4||d2==d3||d2==d4||d3==d4) {
        //   continue;
        // }
        // System.out.println(d4);
        // System.out.println(d3);
        // System.out.println(d2);
        // System.out.println(d1);
        if (d2*3==d4) {
          if (d4+d3+d2+d1==27) {
            if (d1!=d2&&d1!=d3&&d1!=d4&&d2!=d3&&d2!=d4&&d3!=d4) {
              // System.out.println("The secret number is " + nOrg);
              break;
              } //end if
            }//end if
          }//end if
    }// end for loop
    System.out.println("The secret number is " + nOrg);

  }
}
// (d1!=d2&&d1!=d3&&d1!=d4&&d2!=d3&&d2!=d4&&d3!=d4)
