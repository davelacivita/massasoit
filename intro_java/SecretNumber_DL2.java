public class SecretNumber_DL2 {
  public static void main(String[] args) {

    int nOrg, d4, d3, d2, d1, score=0;

    for (int n=3015; n <=9875 ; n=n+2) {
      nOrg = n;
        d1=n/1000;
        n= n%1000;
        d2=n/100;
        n=n%100;
        d3=n/10;
        n=n%10;
        d4=n;

        if (d1!=d2&&d1!=d3&&d1!=d4&&d2!=d3&&d2!=d4&&d3!=d4) {
          ++score;
        }
        if (d3*3==d1) {
          ++score;
        }
        if (d4+d3+d2+d1==27) {
          ++score;
        }
        if (score == 3) {
          System.out.println(score);
          System.out.println("The secret number is " + nOrg);
          break;
        }
        else {
          continue;
        }
        // if (score == 3) {
        //   System.out.println("The secret number is " + nOrg);
    }// end for loop
  }
}
// (d1!=d2&&d1!=d3&&d1!=d4&&d2!=d3&&d2!=d4&&d3!=d4)
