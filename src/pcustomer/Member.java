package pcustomer;

import java.util.Scanner;


import pProcess.SelectionMember;


interface  LoginUsrPwd{
  //create interface class and method for login password
public abstract void EnterUsrPwd();

}



class error extends Exception {// create user define exception handling
            error(String message){

                System.out.println(message);
            }
    }

public class Member implements LoginUsrPwd  
{
  //extend the implement loginuserPwd
  SelectionMember select = new SelectionMember();
  Scanner scan = new Scanner(System.in);
  String username;
  String password;
  //create the variavle username and \ password 

  public Member()
  {//constructor for initial username and pwd
    this.username="Shern";
    this.password="Rafeeq";

    //those are the username and password
  }
  
   public void EnterUsrPwd()
  {  
    
    //call class
    
    for (int tries = 1; tries <= 3; tries++) {// give user 3 try for entering the username & password
        
   
    System.out.print("Enter Username: ");
    String Usrname=scan.next();
    System.out.print("Enter Password: ");
    String Passwd=scan.next();
    System.out.println("");
    
  
    try{// try catch will check either the password is right or wrong 
    if(Usrname.equals(username)&&Passwd.equals(password)){ // check if the password or username right or wrong
     
      int opt; //variable for user input integer value


      //menu for display the 4 options
      do { System.out.println("\nWelcome "+username);
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
      
      } while (opt!= 4);// if while equals to 4 the program will stop
      
      break;
      }//if curly
    

      else{


            throw new error("Username or Password is wrong Try again. Attempt: "+tries+" out of 3");
    }//else curly

  }//try curly
    catch(Exception e){
      
            System.out.println("Account Locked");
         
    }//catch curly
    }//for curly
  }// method curly
}//class curly  

