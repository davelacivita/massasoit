package demos;

public class DemoAssert {
  public static void main(String[] args) {
  int a= 0;
  assert a == 0;
  System.out.println("Line 1");
  ++a;
  assert a == 0;
  System.out.println("Line 2");
  }
}
