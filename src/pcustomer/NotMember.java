package pcustomer;

import java.util.*;

import pProcess.SelectionNotMember;
import pdata.*;

public class NotMember
{
 
  public void Normal_Sell()
  {  

    //call class
    SelectionNotMember slc = new SelectionNotMember();
    Scanner scan = new Scanner(System.in);
   
    
  
      char yn;
      int opt;
      do { System.out.println("\nWelcome Customer");
      System.out.println("====================");
        System.out.println("\n1. Display Item"+"\n2. Show total"+
        "\n3. Discount Checker"+"\n4. Place Order.");
        System.out.print("Please enter your Operation:  ");
        opt = scan.nextInt();
        
      switch (opt) {

          case 1:slc.display_data();break;
          case 2:slc.calculation1();break;
          case 3:slc.calculation2();break;
          case 4:slc.Exit();break; 
          default: System.out.println("Incorrect input."); 
            break;
        }
      
      } while (opt!= 4);
      

      
      }//if curly
    
   
    }//catch curly
  
