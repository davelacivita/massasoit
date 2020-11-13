public class BuyingAComputer_DL
{
  public static void main(String[] args)
  {
   //variables
   double gigOfRam = 16;
   double screenSize = 13;
   double terraBytesOfStorage = 1;
   double mhzProcessorSpeed = 2;
   String AMAZON = " check Amazon for someting closer to what he is looking for.";

   //add your code here to test if Yogi should buy this computer
   //you must use boolean logic
   //print if Yogi should buy it or not

   if (gigOfRam >= 32 && screenSize == 13 && terraBytesOfStorage == 1 && mhzProcessorSpeed == 2){
       System.out.println("Yogi should buy this computer!");
     }
     else {
       System.out.println("Yogi should" + AMAZON);
     }


    //add your code here to test if Boo-Boo should buy this computer
    //you must use boolean logic
   //print if Boo-Boo should buy it or not

   if ((screenSize == 13 || screenSize == 15) && gigOfRam <= 32 && terraBytesOfStorage == 2 && mhzProcessorSpeed ==2){
       System.out.println("Boo-Boo should buy this computer!");
     }
     else {
       System.out.println("Boo-Boo should" + AMAZON);
     }

   //add your code here to test if Wile E. Coyote should buy this computer
   //you must boolean logic
   //print if Wile E. Coyote should buy it or not

   if ((screenSize == 13 || screenSize == 15) && (mhzProcessorSpeed == 1 || mhzProcessorSpeed == 2) && terraBytesOfStorage == 2 && gigOfRam > 0){
       System.out.println("Super Genius should buy this computer!");
     }
     else {
       System.out.println("Super Genius should" + AMAZON);
     }



    //add your code here to test if Roadrunner should buy this computer
    //you must boolean logic
   //print if Roadrunner should buy it or not
   if (gigOfRam >= 16 && screenSize == 15 && terraBytesOfStorage >= 1 && mhzProcessorSpeed == 2){
       System.out.println("Roadrunner should buy this computer!");
     }
     else {
       System.out.println("Roadrunner should" + AMAZON);
     }
   }//end main
   }//end class
