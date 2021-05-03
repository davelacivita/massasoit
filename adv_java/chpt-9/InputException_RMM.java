import java.util.Scanner;

class InputException extends RuntimeException {
        InputException(String m) {
                super(m);
        }
}

public class InputException_RMM {
        static int count = 0;

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                try {
                for (int i = 0;; i++) {
                        char c = sc.next().charAt(0);
                        method1(c);

                }
                }catch(InputException e) {
                        System.out.println(e);
                }
                System.out.println("Total chars: "+count);
        }

        private static void method1(char c) {
                if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))
                        count++;
                else
                        throw new InputException(c + " Invalid character");
        }
}