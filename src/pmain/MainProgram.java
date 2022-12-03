package pmain;
import java.util.Scanner;

import pcustomer.*;
import java.lang.Exception;

//import all package we create

class ErrorMsg extends Exception{
    ErrorMsg(String message){
            System.out.println(message);

    }

}

class MainProgram { //use this class for executing our program

     static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int tries,opt ;
        for (tries = 1; tries <=3; tries++) {
            
            // call user input class, member and notmember class 
           
            Member obj = new Member();
            NotMember obj2=  new NotMember(); 
    
                
    
          try {//create this try catch for use     
          System.out.println("\nWelcome To Sherny Inc.");
          System.out.println("Are you a member?\n\n  1.Member\n  2.Not a member ");
          System.out.print("\nOperation :");
          opt = scan.nextInt();
    
          
            //to check the option
                if(opt==1){obj.EnterUsrPwd();break;}
                else if(opt==2) {  obj2.display_data();break;}
 
            throw new ErrorMsg("Wrong operation Try again. Attempt: "+tries+" out of 3");
        }
      
         catch (Exception e) {
        if (tries==3) {
            System.out.println("You reached your tries. The system will block your request now ");
            System.out.println("Error detail: "+ e);
            
                }//if curly
             }//catch curly
        }//looping curly
    }//main method curly
}//class curly