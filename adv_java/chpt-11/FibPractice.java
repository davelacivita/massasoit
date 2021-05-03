public class FibPractice {
    public static void main(String[] args) {
        long number = Fib(8);
        System.out.println(number);

    }//end main

    public static long Fib(long n) {
        if (n == 0) {
            return 0;
        }

        else if (n == 1) {
            return 1;
        }

        else {
            return Fib(n-1) + Fib(n - 2);
        }  
    }//end method
}//end class
