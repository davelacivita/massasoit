public class Perfect_DL
{
  public static void main(String[] args)
  {
    int sum;
    for (int n = 1; n <= 1000; ++n) {
      sum = 0;
      for (int i = 1; i < n ; ++i) {
      if (n % i == 0) {
        sum = sum + i;
        if (sum == n) {
          System.out.println(n);
          } // end if
        } // end if
      } // end for
    } // end for





  } //end main
} // end class
