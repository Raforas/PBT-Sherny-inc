package pProcess;


public class SelectionNotMember extends SelectionMember { // we extends calss "Data"

//Override
@Override
public void display_data(){//method to display list of menu 
    
    //show set of items that are available
    System.out.println("\n1.Mouse:\tRM "+num1+"\n2.MP3 player:\tRM "+num2+
    "\n3.Webcam:\tRM "+num3+"\n4.Hard drive:\tRM "+num4+"\n5.Headphones:\tRM "+num5
    +"\n6. Exit.");
    
       //we check either the data the is empty or not  
       if (!store.isEmpty()){
        store.clear();//we clear the array
        total=0;
        discount=0;
        used= false;
    }
    
    
    
    
    //while true is for continuously adding the item until user is done
    while(true){
        System.out.print("Enter code of your Item:  ");
        
            //the 'choice' here will check what number user inputed.
            
            int choice = chose.nextInt();
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
            //if user press 6 the program will bring back user to menu
            if(choice == 6){
                break;
            }
            
            
                    }
                    
                }
                
                
                // this variable will be use to check if user make the calculation or not.
                
                
                //Override
                @Override
                public double calculation1() {
                    // for this class we calulate the total of item first
        SelectionNotMember take = new SelectionNotMember();
        
        if (!used) {// if user didn't calculate their total yet this will be user
        total=0;
        for (Double double1 : store) {
            total+=double1;
        }//calculate total curly
        
        System.out.println("Total: RM "+ String.format("%.2f",total));
        //discount doesn't shown here because non member wouldn't get extra promotion
       
        }
        else{ // otherwise this will be shown ; total they got
            
            take.total = total;
            System.out.println("Total: RM "+ String.format("%.2f", total));     
        }
       
        return total;
    }
    
    
    
    //Override
    @Override
    public double calculation2() {
        
        
        if(!used){ // to give discount for a buyer that bought items RM50 or above
            if (total>50) {
                discount = total*0.1;
                total = total - discount;
                System.out.println("There are discount!"); 
                System.out.println("Current total: RM "+String.format("%.2f",total));
                System.out.println("You saved: RM "+ String.format("%.2f",discount));
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
    
    
    //Override
    @Override
    public void Exit() { //method for exiting the program.
        System.out.println("Thank you for purchasing our Item.");
        System.exit(0);
    }
    
}

