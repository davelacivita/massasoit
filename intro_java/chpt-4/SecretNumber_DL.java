public class SecretNumber_DL {
  public static void main(String[] args) {
    // find a 4 digit number that:
    // is odd, no digits repeat, the 4 digits add up to 27, and
    // the digit in the thousands place is equal to 3x the tens place
    // output the number, there can be only one

    int nOrg, d4, d3, d2, d1, score=0;

    for (int n=3015; n <=9875 ; n=n+2) { // increment by 2 so should never be even
      nOrg = n;
      score = 0;
        d1=nOrg/1000;
        nOrg= nOrg%1000;
        d2=nOrg/100;
        nOrg=nOrg%100;
        d3=nOrg/10;
        nOrg=nOrg%10;
        d4=nOrg;

        // test no numbers are the same
        if (d1!=d2&&d1!=d3&&d1!=d4&&d2!=d3&&d2!=d4&&d3!=d4) {
          ++score;
        }
        // test the tens place x3 = the thousands place
        if (d3*3==d1) {
          ++score;
        }
        // test all digits add up to 27
        if (d4+d3+d2+d1==27) {
          ++score;
        }
        if (score == 3) {
          System.out.println(score);
          System.out.println("The secret number is " + n);
          break;
        }
    }// end for loop
  } // end main
} // end class
