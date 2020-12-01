import java.util.Scanner;
// 0 - 20000
// 20000 - 50000
// 50000 - 75000
// 75000 - 100000
// 100000 - 250000
// 250000 - 500000
// 500000
public class taxesLow
{
  public static void main(String[] args)
  {
    double tax;
    int BRACKET1 = 20000;
    int BRACKET2 = 50000;
    int BRACKET3 = 75000;
    int BRACKET4 = 100000;
    int BRACKET5 = 250000;
    int BRACKET6 = 500000;
    double RATE1 = 0.01;
    double RATE2 = 0.02;
    double RATE3 = 0.03;
    double RATE4 = 0.04;
    double RATE5 = 0.05;
    double RATE6 = 0.06;
    double RATE7 = 0.07;
    double TAX1 = 20000 * RATE1;
    double TAX2 = 30000 * RATE2;
    double TAX3 = 25000 * RATE3;
    double TAX4 = 25000 * RATE4;
    double TAX5 = 150000 * RATE5;
    double TAX6 = 250000 * RATE6;
    double taxTotal;
    double taxableIncome;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please enter your taxable income.");
    taxableIncome = keyboard.nextDouble();

    if (taxableIncome <= BRACKET1)
    {
      tax = taxableIncome * RATE1;
      taxTotal = tax;
    }
    else if (taxableIncome > BRACKET1 && taxableIncome <= BRACKET2)
    {
      tax = (taxableIncome - BRACKET1) * RATE2;
      taxTotal = tax + TAX1;
    }
    else if (taxableIncome > BRACKET2 && taxableIncome <= BRACKET3)
    {
      tax = (taxableIncome - BRACKET2) * RATE3;
      taxTotal = tax + TAX1 + TAX2;
    }
    else if (taxableIncome > BRACKET3 && taxableIncome <= BRACKET4)
    {
      tax = (taxableIncome - BRACKET3) * RATE4;
      taxTotal = tax + TAX1 + TAX2 + TAX3;
    }
    else if (taxableIncome > BRACKET4 && taxableIncome <= BRACKET5)
    {
      tax = (taxableIncome - BRACKET4) * RATE5;
      taxTotal = tax + TAX1 + TAX2 + TAX3 + TAX4;
    }
    else if (taxableIncome > BRACKET5 && taxableIncome <= BRACKET6)
    {
      tax = (taxableIncome - BRACKET5) * RATE6;
      taxTotal = tax + TAX1 + TAX2 + TAX3 + TAX4 + TAX5;
    }
    else 
    { 
      tax = (taxableIncome - BRACKET6) * RATE7;
      taxTotal = tax + TAX1 + TAX2 + TAX3 + TAX4 + TAX5 + TAX6;
    }
    System.out.printf("Your total income tax due is $%.2f\n", taxTotal);  
    keyboard.close();  
  } // end main
} // end class
