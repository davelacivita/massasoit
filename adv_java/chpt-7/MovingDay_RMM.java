//Losing combination: 2-1-0

//Winning combination: 2-4-5-3-1-0-2-4-6-5-3-1-2-4-3

import java.util.Scanner;

public class MovingDay_RMM
 {
  public static void playGame(int array[]) 
   {
  
  for (int i = 0; i < array.length; i++)
   System.out.print(" " + i);
   System.out.println();
   System.out.print("|");

    for (int i = 0; i < array.length; i++) 
     {
  
      if (array[i] == 1)
       System.out.print("T|");

      else if (array[i] == 0)
       System.out.print("F|");

      else
       System.out.print(" |");
         }//end for loop
         System.out.println();
           }//end method
  
            public static void main(String[] args) 
             {
              Scanner keyboard = new Scanner(System.in);
      
             int f, t, n, move, empty;
                       
          System.out.print("How many 'Falses' do you want to use? ");
           f = keyboard.nextInt();
           
          System.out.println(" ");
           
          System.out.print("How many 'Trues' do you want to use? ");
           t = keyboard.nextInt();
           
          System.out.println(" ");
         
           n = f + t + 1;
  
            int array[] = new int[n];
            
             for (int i = 0; i < t; i++ ) 
              {
               array[i] = 1;
                }//end for loop
                
            array[t] = 2;
            empty = t;
            
            for (int i = t + 1; i < n; i++ ) 
             {
              array[i] = 0;
               }//end for loop
  
                  while (true) 
                   {
                    playGame(array);
                     boolean win = true;
                       for (int i = 0; i < n; i++)
                        {
                         if (i < f && array[i] != 0) 
                          {
                           win = false;
                             break;
                              }//end if loop
  
  
                     if (i == f && array[i] != 2) 
                      {
                       win = false;
                         break;
                          }//end if loop
                          
                        if (i > f && array[i] != 1) 
                         {
                          win = false;
                           break;
                            }//end if loop
                         }//end for loop
                         
                        if (win) 
                         {
                          System.out.println(" ");                         
                          System.out.println("You won :)");
                           break;
                            }//end if loop
  
                             if (!((empty - 1) >= 0 && array[empty - 1] == 1) && !((empty + 1) < n && array[empty + 1] == 0)) 
                              {
                               if (!((empty - 2) >= 0 && array[empty - 2] == 1 && array[empty - 1] == 0)
                                && !((empty + 2) < n && array[empty + 2] == 0)) 
                                 {
                                  System.out.println(" ");
                                  System.out.println("You lost :(");
                                    break;
                                     }//end inner if loop
                                   }//end outer if loop
  
  
                             while (true) 
                              {
                               System.out.println(" ");
                               System.out.print("Enter a number to move the corresponding piece: ");
                                move = keyboard.nextInt();
                                
                                  System.out.println(" ");
  
  
                                    if (array[move] == 1) 
                                     {
  
                                       if ((move + 1) == empty) 
                                        {
                                         System.out.println("'True' #" + move + " slides to the right");
                                          array[move] = 2;
                                          array[move + 1] = 1;
                                          empty = move;
                                          System.out.println(" ");

                                           }//end if loop
                                           
                                       else if ((move + 2) == empty && array[move + 1] == 0) 
                                        {
                                         System.out.println("'True' #" + move + " jumps to the right");
                                          array[move] = 2;
                                          array[move + 2] = 1;
                                          empty = move;
                                          System.out.println(" ");
                                           }//end else if loop
                                           
                                       else if ((move + 2) == empty && array[move + 1] == 1) 
                                        {
                                         System.out.println("Illegal move! You cannot jump a 'True' over another 'True'");
                                         System.out.println(" ");
                                          continue;
                                           }//end else if loop
                                           
                                       else 
                                        {
                                         System.out.println("Try again! There is no room to slide a 'True'");
                                         System.out.println("Try again! There is no room to jump a 'True'");
                                         System.out.println(" ");
                                          continue;
                                           }//end else loop
                                            break;
                                             }//end if loop
  
                                                if (array[move] == 0)
                                                 {
  
                                                 if ((move - 1) == empty) 
                                                  {
                                                   System.out.println("'False' #" + move + " slides to the left");
                                                    array[move] = 2; 
                                                    array[move - 1] = 0;
                                                    empty = move;
                                                    System.out.println(" ");
                                                     }//end if loop
                                                     
                                                  else if ((move - 2) == empty) 
                                                   {
                                                    System.out.println("'False' #" + move + " jumps to the left");
                                                     array[move] = 2;
                                                     array[move - 2] = 0;
                                                     empty = move;
                                                     System.out.println(" ");
                                                      }//end else if loop
                                                      
                                                   else
                                                    {
                                                     System.out.println("Try again! There is no room to slide a 'False'");
                                                     System.out.println("Try again! There is no room to jump a 'False'");
                                                     System.out.println(" ");
                                                      continue;
                                                       }//end else loop
                                                        break;
                                                }//end if loop
                                   }//end inner while loop
                     }//end outer while loop
         }//end method
}//end class