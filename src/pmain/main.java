package pmain;
import java.util.*;

import pProcess.*;
import pcustomer.*;

class main extends Member {

    static  Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Member obj = new Member();
      NotMember obj2=  new NotMember(); 


      System.out.println("\nAre you a member?\n\n  1.Member\n  2.Not a member ");
        System.out.print("\nOperation :");
        int opt = scan.nextInt();

        switch (opt) {
            case 1:obj.EnterUsrPwd();break;
            case 2 : obj2.Normal_Sell();break;
            default:System.out.println("Wrong Input.");break;
        }//switch curly        
    
    }//main method curly
}//class curly