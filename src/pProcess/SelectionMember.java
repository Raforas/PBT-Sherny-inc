package pProcess;

import pdata.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
//import the essential package in this case for random promotion,user input and storing data


public class SelectionMember implements Data{ // we extends calss "Data"

    //create random promotion to spice things up.
    //this is a class that allow user to set random given number
    Random promo = new Random();
    
    //scanner for user input
    Scanner chose = new Scanner(System.in);
    
    //for inserting each purchases
    ArrayList<Double> store = new ArrayList<>();
    
    //member will get random deal each promotion    
    int deal = promo.nextInt(50) + 1;
    
    
    //set the value for each items
    double  total=0,discount=0,
    num1=40.99,num2=10.99,
    num3=70.49,num4=149.99,
    num5=25.50;
    String add = "Item added.";
    
    
    public void display_data(){//method to display list of menu 
        
        //first show the member what is the promotion is. 
        System.out.println("\n FOR THIS MONTH, HERE IS YOUR DEAL: " +deal+"%");
        
        //show set of items that are available
        System.out.println("\n1.Mouse:\tRM "+num1+"\n2.MP3 player:\tRM "+num2+
        "\n3.Webcam:\tRM "+num3+"\n4.Hard drive:\tRM "+num4+"\n5.Headphones:\tRM "+num5
        +"\n6. Exit.");
        
        
            //we check either the data the is empty or not  
            if (!store.isEmpty()){
                store.clear();
            }
            
            
            
            //while true is for continuously adding the item until user is done
            while(true){
                System.out.print("Enter code of your Item:  ");// asking the Item code 
            int choice = chose.nextInt();
            //the 'choice' here will check what number user inputed.
            switch (choice) {//switch case 
                
                case 1: store.add(num1); System.out.println(add); break;
                case 2: store.add(num2); System.out.println(add); break;
                case 3: store.add(num3); System.out.println(add); break;
                case 4: store.add(num4); System.out.println(add); break;
                case 5: store.add(num5); System.out.println(add); break;
                case 6: break;
                //choices
                
                
                default: System.out.println("Wrong operation."); break;
                }
                
                //if user press 6 the program will bring back user to menu.
                if(choice == 6){
                    break;
                }
            }
            
        }
        
        // this variable will be use to check if user make the calculation or not.
        boolean used=false;
        
        public double calculation1() { // for this class we calulate the total of item first
            SelectionMember take = new SelectionMember();
            
            if (!used) {// if user didn't calculate their total yet this will be user
            total=0;
            discount=0;
            for (Double double1 : store) {
                total+=double1;
            }//calculate total curly
            
            
            discount=total*((double)deal/100);
            System.out.println("\nYour Original Total: RM"+String.format("%.2f",total));
            total=total- discount;
            System.out.println("After Discount: RM "+String.format("%.2f",total));
            System.out.println("You saved:RM "+ String.format("%.2f",discount));
            
        }
        
        else{ // otherwise this will be shown ; total they got
            
            take.total = total;
            take.discount = discount;
            System.out.println("Total: RM "+ String.format("%.2f", total));     
            
        }
        
        return total;
    }
    
    
    
    public double calculation2() {
        
        SelectionMember take1 = new SelectionMember();
        
        if(!used){ // to give discount for a buyer that bought items RM50 or above
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
    
    public void Exit() { //method for exiting the program.
        System.out.println("Thank you for purchasing our Item.");
        System.exit(0);
    }
    
    
}//curly class 