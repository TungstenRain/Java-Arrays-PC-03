package ch07pc03;
import java.util.Scanner;

/**
 *
 * @author Frank
 * date 11/13/2017
 * purpose: to validate an account number against an array of account numbers
 */
public class Ch07pc03 {

    public static void main(String[] args) {
        //variables
        int acctNum;
        
        //create keyboard Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Request input from user
        System.out.print("Please enter the account number: ");
        acctNum = keyboard.nextInt();
        
        //instantiate the ChargeAccount class
        ChargeAccount chargeNumber = new ChargeAccount();
        
        if (chargeNumber.validAccount(acctNum))
        {
            System.out.println("The account number " + acctNum + " is valid.");
        }
        else
        {
            System.out.println("The account number " + acctNum + " is not valid.");
        }
    }
    
}
