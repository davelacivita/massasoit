public class SecretNumber_DL3 {
  public static void main(String[] args) {

    int n=3015, nOrg, d4, d3, d2, d1, score=0;

    while (n >= 3015 && n <= 9999);
    nOrg = n;
      d1=n/1000;
      n= n%1000;
      d2=n/100;
      n=n%100;
      d3=n/10;
      n=n%10;
      d4=n;

      // no numbers are the same
      if (d1!=d2&&d1!=d3&&d1!=d4&&d2!=d3&&d2!=d4&&d3!=d4) {
        ++score;
      }
      // the tens place *3 = the thousands place
      if (d3*3==d1) {
        ++score;
      }
      // all digits add up to 27
      if (d4+d3+d2+d1==27) {
        ++score;
      }
      if (score == 3) {
        System.out.println(score);
        System.out.println("The secret number is " + nOrg);
      }
      n=n+2;
  }
}
