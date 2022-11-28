package pcustomer;

import java.lang.Exception;
import java.util.Scanner;

import pProcess.*;

abstract class LoginUsrPwd{
abstract public void EnterUsrPwd();

}



class error extends Exception {
            error(String message){

                System.out.println(message);
            }

    }

public class Member extends LoginUsrPwd
{
  Scanner scan = new Scanner(System.in);
  String username;
  String password;
  
  public Member()
  {//constructor for initial username and pwd
    this.username="Shern";
    this.password="Rafeeq";
  }
  
  public void EnterUsrPwd()
  {  

    //call class
    SelectionMember slc = new SelectionMember();
    
    for (int i = 3; i > 0; i--) {
        
   
    System.out.print("Enter Username: ");
    String Usrname=scan.next();
    System.out.print("Enter Password: ");
    String Passwd=scan.next();
    System.out.println("");
    
  
    try{
    if(Usrname.equals(username)&&Passwd.equals(password)){
     
      char yn;
      int opt;
      do { System.out.println("\nWelcome "+username);
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
      
  //test

      break;
      }//if curly
    
      else{


            throw new error("Username or Password is wrong");
    }//else curly

  }//try curly
    catch(Exception e){
        if(i!=1){
            System.out.println("try again");
        }// if curly
        else{
            System.out.println("Account Locked");
        }//else curly 
    }//catch curly
    }//for curly
  }// method curly
}//class curly  

