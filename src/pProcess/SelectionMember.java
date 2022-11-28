package pProcess;

import pdata.*;
import java.util.*;

public class SelectionMember implements Data{

    //create random promotion to spice things up.
    //this is a class that allow user to set random given number
			Random promo = new Random();
    //scanner for user input
            Scanner chose = new Scanner(System.in);
 //for inserting each purchases
            ArrayList<Double> store = new ArrayList<>();
            
            
			int deal = promo.nextInt(50) + 1;//member will get random deal each promotion    
         
    
    //set the value for each items
			double  total=0,discount=0,
                    num1=40.99,num2=10.99,
                    num3=70.49,num4=149.99,
 				 	num5=25.50;

                
		 public void display_data(){
		 
			
            System.out.println("\n FOR THIS MONTH, HERE IS YOUR DEAL: " +deal+"%");

			System.out.println("\n1.Mouse:\tRM "+num1+"\n2.MP3 player:\tRM "+num2+
			"\n3.Webcam:\tRM "+num3+"\n4.Hard drive:\tRM "+num4+"\n5.Headphones:\tRM "+num5
            +"\n6. Exit.");

               if (!store.isEmpty()){
                store.clear();
            }
        char yn;
         while(true){
            System.out.print("Enter code of your Item:  ");

         
            int choice = chose.nextInt();
                switch (choice) {
                    case 1: store.add(num1); System.out.println("Item added."); break;
                    case 2: store.add(num2); System.out.println("Item added."); break;
                    case 3: store.add(num3); System.out.println("Item added."); break;
                    case 4: store.add(num4); System.out.println("Item added."); break;
                    case 5: store.add(num5); System.out.println("Item added."); break;
                    case 6: break;
                    
                    default: System.out.println("Wrong operation."); break;
                }
                     if(choice == 6){
                        break;
                 }
             

            }
          
        }
                
		
 

        boolean used=false;

        public double calculation1() {
            SelectionMember take = new SelectionMember();
    
            if (!used) {
                total=0;
                discount=0;
                for (Double double1 : store) {
                    total+=double1;
                }//calculate total curly
                
                discount=total*((double)deal/100);
                total=total- discount;
                System.out.println("\nAfter Discount: RM "+String.format("%.2f",total));
                System.out.println("You saved:RM "+ String.format("%.2f",discount));
                
            }
            else{
        
            take.total = total;
             System.out.println("Total: RM "+ String.format("%.2f", total));     
            }
           
            return total;
        }
    
    
     
        public double calculation2() {
           
            SelectionMember take1 = new SelectionMember();
            
            if(!used){
                if (total>50) {
                    take1.discount = discount;
                    discount =  total*0.1;
                    total = total - discount;
                    System.out.println("There are discount: RM "+String.format("%.2f",total));
                    System.out.println("You saved: RM "+ String.format("%.2f",take1.discount+discount));
                    used = true;
                    
            }//if curly
             else if (total<50)
                {
                System.out.println("There are no discount.");
                }//else curly 
            }//bool curly
            else{
                System.out.println("The current price: RM "+String.format("%.2f",total));
                System.out.println("You have used your discount. Thank you.");
            }
    
        return total;
        }//method curly
    
        
    
        public void Exit() {
        System.out.println("Thank you for purchasing our Item.");
        System.exit(0);
        }


}