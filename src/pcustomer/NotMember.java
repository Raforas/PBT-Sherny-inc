package pcustomer;

import java.util.Scanner;

import pProcess.*;

public class NotMember
{
  
  static  Scanner scan = new Scanner(System.in);
     
 
  public void Normal_Display() 
  {  // for non member we will only display the method, no need for password and username

    SelectionMember  select = new SelectionNotMember();
    //call class
    
    int opt;
  
    
      //menu for display the 4 options
      do { 
        System.out.println("\nWelcome Customer");
        System.out.println("====================");
        System.out.println("\n1. Display Item"+"\n2. Show total"+
        "\n3. Discount Checker"+"\n4. Place Order.");
        System.out.print("Please enter your Operation:  ");
        opt = scan.nextInt();
        
      switch (opt) {

          case 1:select.display_data();break;
          case 2:select.calculation1();break;
          case 3:select.calculation2();break;
          case 4:select.Exit();break; 
          default: System.out.println("Incorrect input."); 
            break;
        }
      
      } while (opt!= 4); // if while equals to 4 the program will stop
      

      
      }//if curly
    
   
    }//catch curly
  
